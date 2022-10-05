package op.mobile.app.dev.mcdohr2.travelling.ui.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import op.mobile.app.dev.mcdohr2.travelling.R

class SignupFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)

        val btnLogin: Button = view.findViewById(R.id.btn_login) // Get a reference to login button in fragment_login.xml

        val btnSignup: Button = view.findViewById(R.id.btn_signup) // Get a reference to signup button in fragment_login.xml

        btnSignup.setOnClickListener { // Bind a click event listener to the button
            val action = SignupFragmentDirections
                .actionSignupFragmentToHomeFragment()// Get a reference to the action in Login fragment in mobile_navigation.xml
            view?.findNavController()?.navigate(action) // Navigate based on the action, i.e., login to home
        }

        btnLogin.setOnClickListener { // Bind a click event listener to the button
            val action = SignupFragmentDirections
                .actionSignupFragmentToLoginFragment() // Get a reference to the action in Login fragment in mobile_navigation.xml
            view?.findNavController()?.navigate(action) // Navigate based on the action, i.e., login to home
        }

        return view
    }
}
