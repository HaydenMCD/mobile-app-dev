package op.mobile.app.dev.mcdohr2.travelling.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import op.mobile.app.dev.mcdohr2.travelling.R
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val action = SplashFragmentDirections
                    .actionSplashFragmentToLoginFragment() // Get a reference to the action in Login fragment in mobile_navigation.xml
                view?.findNavController()?.navigate(action)
                // Navigate from the splash screen to the login screen, i.e., create an action in mobile_navigation.xml
            },
            3000
        )

        return view
    }
}