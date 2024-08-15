package com.example.mycalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Establishing variables

        //User interaction
        var input1 = findViewById<EditText>(R.id.input1)
        var input2 = findViewById<EditText>(R.id.input2)
        var add = findViewById<Button>(R.id.additionBtn)
        var sub = findViewById<Button>(R.id.subtractionBtn)
        var multiply = findViewById<Button>(R.id.multiplyBtn)
        var divide = findViewById<Button>(R.id.divideBtn)


        //Displays

        var result = findViewById<TextView>(R.id.resultDisplay)
        var error = findViewById<TextView>(R.id.errorMsg)


        //Button functions

        add.setOnClickListener{
            //code for addition
            var answer= input1.text.toString().toInt() + input2.text.toString().toInt()

            //code for moving to display
            result.text = input1.text.toString().plus("+")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)

            //error message
            error.text = "No error encountered"
        }
        sub.setOnClickListener {
            //code for subtraction
            var answer = input1.text.toString().toInt() - input2.text.toString().toInt()

            //code for moving to display
            result.text = input1.text.toString().plus("-")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)

            //error message
            error.text = "No error encountered"
        }

        multiply.setOnClickListener{
            //code for multiplication
            var answer = input1.text.toString().toInt() * input2.text.toString().toInt()

            //code for moving to display
            result.text = input1.text.toString().plus("x")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)

            //error message
            error.text = "No error encountered"
        }

        divide.setOnClickListener{
            //code for division
            var answer = input1.text.toString().toInt() / input2.text.toString().toInt()

            //code for moving to display
            result.text = input1.text.toString().plus("÷")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)

            //error message
            error.text = "No error encountered"
        }

    }
}