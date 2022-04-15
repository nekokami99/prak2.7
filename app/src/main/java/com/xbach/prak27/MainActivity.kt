package com.xbach.prak27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var checkBox:CheckBox
    private lateinit var radioButton :RadioButton
    private lateinit var radioButton2 :RadioButton
    private lateinit var textView :TextView
    private lateinit var toggleButton :ToggleButton
    private lateinit var radioGroup :RadioGroup


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI();

        var tv = ""
        button.setOnClickListener {
            tv = tv.plus("EditText: "+editText.text.toString())
            if (toggleButton.isChecked) {
                tv = tv.plus("\nToggleButton: ON")
            } else {
                tv = tv.plus("\nToggleButton: OFF")
            }

            if(checkBox.isChecked)
                tv = tv.plus("\nCheckBox: ON")
            else
                tv = tv.plus("\nCheckBox: OFF")

            if(radioButton.isChecked)
                tv = tv.plus("\nRadioGroup: RadioButton 1")

            if(radioButton2.isChecked)
                tv = tv.plus("\nRadioGroup: RadioButton 2")

            textView.text = tv
            tv = ""
        }
    }

    private fun initUI(){
        button=findViewById(R.id.button)
        editText=findViewById(R.id.editText)
        checkBox=findViewById(R.id.checkBox)
        radioButton=findViewById(R.id.radioButton)
        radioButton2=findViewById(R.id.radioButton2)
        textView=findViewById(R.id.textView)
        toggleButton=findViewById(R.id.toggleButton)
        radioGroup=findViewById(R.id.radioGroup)
    }
}


