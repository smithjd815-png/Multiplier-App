package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val txtAnswer = findViewById<TextView>(R.id.txtAnswer)

        // Added numbers
        num1.setText("26")
        num2.setText("52")

        btnMultiply.setOnClickListener {

            val number1 = num1.text.toString().toDouble()
            val number2 = num2.text.toString().toDouble()

            val result = multiplyNumbers(number1, number2)

            txtAnswer.text = "Answer: $result"
        }
    }

    // multiply my numbers
    fun multiplyNumbers(a: Double, b: Double): Double {
        return a * b
        }
    }
