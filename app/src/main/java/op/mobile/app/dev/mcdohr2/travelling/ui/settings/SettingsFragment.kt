package op.mobile.app.dev.mcdohr2.travelling.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch
import op.mobile.app.dev.mcdohr2.travelling.R
import op.mobile.app.dev.mcdohr2.travelling.UIMode

/**
 * This class handles all of the onClick events for the settings page.
 */
class SettingsFragment : Fragment() {
    private lateinit var swToggleDarkMode: SwitchCompat
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        auth = FirebaseAuth.getInstance()
        val view: View = inflater.inflate(R.layout.fragment_settings, container, false)
        swToggleDarkMode = view.findViewById(R.id.sw_toggle_dark_mode)

        /**
         * Instantiating SettingsManager - passing in a context. For Fragments, we use requireContext()...for Activities, we use this
         */
        val settingsManager = SettingsManager(requireContext())
        val btnLogout: Button = view.findViewById(R.id.btn_logout)
        val btnBackHome: Button = view.findViewById(R.id.btn_back_home)

        btnBackHome.setOnClickListener {
            val action = SettingsFragmentDirections
                .actionSettingsFragmentToHomeFragment()
            view.findNavController().navigate(action)
        }

        /**
         * When this button is pressed the user is logged out of firebase
         * and routed back to the login page.
         */
        btnLogout.setOnClickListener {
            auth.signOut()

            val action = SettingsFragmentDirections
                .actionSettingsFragmentToLoginFragment()
            view.findNavController().navigate(action)
        }

        // Observe changes to UIMode
        settingsManager.uiModeFlow.asLiveData().observe(viewLifecycleOwner) {
            setCheckedUIMode(it)
        }

        // OnCheckedChangeListener bound to the Switch widget
        swToggleDarkMode.setOnCheckedChangeListener { _, isChecked ->
            lifecycleScope.launch {
                when (isChecked) {
                    // If checked, set to dark mode, else, set to light mode
                    true -> settingsManager.setUIMode(UIMode.DARK)
                    false -> settingsManager.setUIMode(UIMode.LIGHT)
                }
            }
        }
        return view
    }

    /**
     * Checking if dark mode is enabled and setting the switch to the right position
     */
    private fun setCheckedUIMode(uiMode: UIMode?) {
        when (uiMode) {
            UIMode.LIGHT -> {
                // This changes the UI mode to light mode. It will use the default themes.xml
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                swToggleDarkMode.isChecked = false
            }
            UIMode.DARK -> {
                // This changes the UI mode to dark mode. It will use the night themes.xml
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                swToggleDarkMode.isChecked = true
            }
        }
    }
}