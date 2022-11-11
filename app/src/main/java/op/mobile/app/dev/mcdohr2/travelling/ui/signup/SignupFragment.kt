package op.mobile.app.dev.mcdohr2.travelling.ui.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import op.mobile.app.dev.mcdohr2.travelling.R
import android.util.Patterns.*

/**
 * This fragment handles sending the signup information to firebase and any validation.
 *
 * Once the input fields have been filled out with the signup information,
 * The signup button can be tapped which sends the information to firebase and creates a new user.
 */
class SignupFragment: Fragment() {
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)

        // Get a new instance of Firebase authentication
        auth = FirebaseAuth.getInstance()

        // Get the Views from fragment_register by their ids
        val btnLogin: Button = view.findViewById(R.id.btn_login)
        val btnRegister: Button = view.findViewById(R.id.btn_signup)
        val etEmailAddress: EditText = view.findViewById(R.id.et_email_address)
        val etPassword: EditText = view.findViewById(R.id.et_password)
        val etConfirmPassword: EditText = view.findViewById(R.id.et_confirm_password)

        btnRegister.setOnClickListener {
            val email = etEmailAddress.text.toString()
            val password = etPassword.text.toString()
            val confirmPassword = etConfirmPassword.text.toString()

            /**
             * Validation for the input's
             */
            when {
                email.isEmpty() ->
                    etEmailAddress.error = "Email is required."
                !EMAIL_ADDRESS.matcher(email).matches() ->
                    etEmailAddress.error = "Email format is invalid"
                password.isEmpty() ->
                    etPassword.error = "Password is required"
                password.length < 8 ->
                    etPassword.error = "Password must be at least 8 characters"
                confirmPassword.isEmpty() ->
                    etConfirmPassword.error = "Password confirmation is required"
                password != confirmPassword ->
                    etConfirmPassword.error = "Passwords don't match"
                else -> {
                    signup(email, password) // Call if validation rules pass
                }
            }
        }

        /**
         * Routes to the login fragment
         */
        btnLogin.setOnClickListener {
            val action = SignupFragmentDirections
                .actionSignupFragmentToLoginFragment()
            view?.findNavController()?.navigate(action)
        }

        return view
    }

    /**
     * This function registers a new user using Firebase authentication
     *
     * @param email the new user's email address
     * @param password the new user's password
     */
    private fun signup(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    // Indicate to the application user that a new user has been created
                    Toast.makeText(
                        activity,
                        "User created.",
                        Toast.LENGTH_LONG
                    ).show()

                    // Navigate to the login screen. Check mobile_navigation.xml for this action
                    view?.findNavController()?.navigate(
                        SignupFragmentDirections.actionSignupFragmentToLoginFragment()
                    )
                } else {
                    // Indicate to the application user if the email address already exists
                    Toast.makeText(
                        activity,
                        "Email address already exists.",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
    }
}