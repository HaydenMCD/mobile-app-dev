package op.mobile.app.dev.mcdohr2.travelling.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import op.mobile.app.dev.mcdohr2.travelling.R

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnLogin: Button = view.findViewById(R.id.btn_login) // Get a reference to login button in fragment_login.xml

        val btnSignup: Button = view.findViewById(R.id.btn_Signup) // Get a reference to signup button in fragment_login.xml

        btnLogin.setOnClickListener { // Bind a click event listener to the button
            val action = LoginFragmentDirections
                .actionLoginFragmentToHomeFragment() // Get a reference to the action in Login fragment in mobile_navigation.xml
            view?.findNavController()?.navigate(action) // Navigate based on the action, i.e., login to home
        }

        btnSignup.setOnClickListener { // Bind a click event listener to the button
            val action = LoginFragmentDirections
                .actionLoginFragmentToSignupFragment() // Get a reference to the action in Login fragment in mobile_navigation.xml
            view?.findNavController()?.navigate(action) // Navigate based on the action, i.e., login to home
        }

        return view
    }
}