package com.mertadali.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var  number2 : Int? = null
    var result : Int ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mySum(view: View){
       number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            textView.text = "Number not entered"

        }else{
            result = number1!! + number2!!

            textView.text = "Result: $result"
        }

    }
    fun mySub(view: View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            textView.text = "Number not entered"

        }else{
            result = number1!! - number2!!

            textView.text = "Result: $result"
        }


    }
    fun myDivide(view: View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            textView.text = "Number not entered"

        }else{
            result = number1!! / number2!!

            textView.text = "Result: $result"
        }


    }
    fun myMultiply(view: View){
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            textView.text = "Number not entered"

        }else{
            result = number1!! * number2!!

            textView.text = "Result: $result"
        }


    }

}