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
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import op.mobile.app.dev.mcdohr2.travelling.R
import op.mobile.app.dev.mcdohr2.travelling.ui.yandex.YandexInstance.YandexRetrofitInstance
import java.util.*

class TranslateFragment: Fragment() {
    lateinit var tts: TextToSpeech
    private val job = Job()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val view = inflater.inflate(R.layout.fragment_translate, container, false)

        val btnTTS: ImageButton = view.findViewById(R.id.ibtn_text_to_speech)
        val etText: EditText = view.findViewById(R.id.et_translation_text)

        val btnSpanish: Button = view.findViewById(R.id.btn_translate_to_ES)
        val btnDutch: Button = view.findViewById(R.id.btn_translate_to_NL)
        val btnChinese: Button = view.findViewById(R.id.btn_translate_to_ZH)
        val btnAfrikaans: Button = view.findViewById(R.id.btn_translate_to_AF)
        val etOutput: EditText = view.findViewById(R.id.et_translation_output)

        btnTTS.isEnabled = false

        /***
         * Enables/disables the button depending if there is text in the edit text or not *
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

        btnSpanish.setOnClickListener {
            val textInput = etText.text.toString()
            val language = "en-es"

            when {
                textInput.isEmpty() ->
                    etText.error = "Text is required."
                else -> {
                    lifecycleScope.launch {
                        val response = YandexRetrofitInstance.getResponse(
                            "trnsl.1.1.20200329T025311Z.37f6897b8a99dbd9.bb42d876c007fde0812c365015625fde8c0f0163",
                            textInput,
                            language
                        )
                        etOutput.setText(response.text[0])
                    }
                }
            }
        }

        btnDutch.setOnClickListener {
            val textInput = etText.text.toString()
            val language = "en-nl"

            when {
                textInput.isEmpty() ->
                    etText.error = "Text is required."
                else -> {
                    lifecycleScope.launch {
                        val response = YandexRetrofitInstance.getResponse(
                            "trnsl.1.1.20200329T025311Z.37f6897b8a99dbd9.bb42d876c007fde0812c365015625fde8c0f0163",
                            textInput,
                            language
                        )
                        etOutput.setText(response.text[0])
                    }
                }
            }
        }

        btnChinese.setOnClickListener {
            val textInput = etText.text.toString()
            val language = "en-zh"

            when {
                textInput.isEmpty() ->
                    etText.error = "Text is required."
                else -> {
                    lifecycleScope.launch {
                        val response = YandexRetrofitInstance.getResponse(
                            "trnsl.1.1.20200329T025311Z.37f6897b8a99dbd9.bb42d876c007fde0812c365015625fde8c0f0163",
                            textInput,
                            language
                        )
                        etOutput.setText(response.text[0])
                    }
                }
            }
        }

        btnAfrikaans.setOnClickListener {
            val textInput = etText.text.toString()
            val language = "en-af"

            when {
                textInput.isEmpty() ->
                    etText.error = "Text is required."
                else -> {
                    lifecycleScope.launch {
                        val response = YandexRetrofitInstance.getResponse(
                            "trnsl.1.1.20200329T025311Z.37f6897b8a99dbd9.bb42d876c007fde0812c365015625fde8c0f0163",
                            textInput,
                            language
                        )
                        etOutput.setText(response.text[0])
                    }
                }
            }
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

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }
}