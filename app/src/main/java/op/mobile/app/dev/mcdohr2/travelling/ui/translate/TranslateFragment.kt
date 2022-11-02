package op.mobile.app.dev.mcdohr2.travelling.ui.translate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import op.mobile.app.dev.mcdohr2.travelling.R

class TranslateFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_translate, container, false)
//        val languages = resources.getStringArray(R.array.LANGUAGES)
//
//        val spinner: Spinner = view.findViewById(R.id.spinner_languages)
//
//        if (spinner != null) {
//            val adapter = ArrayAdapter(
//                this,
//                android.R.layout.simple_spinner_item, languages
//            )
//            spinner.adapter = adapter
//        }
        return view
    }

}