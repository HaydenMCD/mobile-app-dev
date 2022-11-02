package op.mobile.app.dev.mcdohr2.travelling.ui.translate

import android.content.Context
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import op.mobile.app.dev.mcdohr2.travelling.R
import java.util.*

class TranslateFragment: Fragment() {
    lateinit var tts: TextToSpeech

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val view = inflater.inflate(R.layout.fragment_translate, container, false)

        val btnTTS: ImageButton = view.findViewById(R.id.ibtn_text_to_speech)
        val etText: EditText = view.findViewById(R.id.et_translation_text)
        btnTTS.isEnabled = false

        /***
         * This function enables/disables the button depending if there is text in the edit text or not *
         */
        etText.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s:CharSequence, start:Int, before:Int, count:Int) {
                if (s.toString().trim({ it <= ' ' }).isEmpty())
                {
                    btnTTS.setEnabled(false)
                }
                else
                {
                    btnTTS.setEnabled(true)
                }
            }
            override fun beforeTextChanged(s:CharSequence, start:Int, count:Int,
                                           after:Int) {
                // TODO Auto-generated method stub
            }
            override fun afterTextChanged(s: Editable) {
                // TODO Auto-generated method stub
            }
        })

        btnTTS.setOnClickListener{
            tts = TextToSpeech(context, TextToSpeech.OnInitListener {
                    if(it == TextToSpeech.SUCCESS){
                        tts.language = Locale.US
                        tts.setSpeechRate(1.0f)
                        tts.speak(etText.text.toString(), TextToSpeech.QUEUE_ADD, null)
                    }
            })
        }

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