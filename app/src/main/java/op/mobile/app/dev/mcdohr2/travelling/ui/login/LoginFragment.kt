package op.mobile.app.dev.mcdohr2.travelling.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import op.mobile.app.dev.mcdohr2.travelling.R
import op.mobile.app.dev.mcdohr2.travelling.ui.login.LoginFragmentDirections.*

class LoginFragment : Fragment() {
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        auth = FirebaseAuth.getInstance()

        val btnLogin: Button = view.findViewById(R.id.btn_login)
        val etEmailAddress: EditText = view.findViewById(R.id.et_email_address)
        val etPassword: EditText = view.findViewById(R.id.et_password)
        val tvSignUp: TextView = view.findViewById(R.id.btn_signup)

        btnLogin.setOnClickListener {
            val email = etEmailAddress.text.toString()
            val password = etPassword.text.toString()

            when {
                email.isEmpty() ->
                    etEmailAddress.error = "Email is required."
                password.isEmpty() ->
                    etPassword.error = "Password is required"
                else -> {
                    login(email, password)
                }
            }
        }

        tvSignUp.setOnClickListener {
            val action =
                actionLoginFragmentToSignupFragment()
            view?.findNavController()?.navigate(action)
        }

        return view
    }

    /**
     * This function signs in a user using Firebase authentication
     *
     * @param email the user's email address
     * @param password the user's password
     */
    private fun login(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(requireActivity()) {
                if (it.isSuccessful) {
                    val action =
                        actionLoginFragmentToHomeFragment()
                    view?.findNavController()?.navigate(action)
                } else {
                    Toast.makeText(
                        activity,
                        "Failed to sign in.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }
}