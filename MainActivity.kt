package com.example.mycalculator


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.b1)
        val button2 = findViewById<Button>(R.id.b2)
        val button3 = findViewById<Button>(R.id.b3)
        val button4 = findViewById<Button>(R.id.b4)
        val button5 = findViewById<Button>(R.id.b5)
        val button6 = findViewById<Button>(R.id.b6)
        val button7 = findViewById<Button>(R.id.b7)
        val button8 = findViewById<Button>(R.id.b8)
        val button9 = findViewById<Button>(R.id.b9)
        val dotbutton = findViewById<Button>(R.id.dot)
        val minusbotton = findViewById<Button>(R.id.minus)
        val plusbutton = findViewById<Button>(R.id.plus)
        val dividebutton = findViewById<Button>(R.id.divide)
        val multipybutton = findViewById<Button>(R.id.multiply)
        val textchamps = findViewById<TextView>(R.id.text)
        val equalbutton = findViewById<Button>(R.id.equal)

        button1.setOnClickListener {
            textchamps.text = "1"
        }
        button2.setOnClickListener {
            textchamps.text = "2"
        }
        button3.setOnClickListener {
            textchamps.text = "3"
        }
        button4.setOnClickListener {
            textchamps.text = "4"
        }
        button5.setOnClickListener {
            textchamps.text = "5"
        }
        button6.setOnClickListener {
            textchamps.text = "6"
        }
        button7.setOnClickListener {
            textchamps.text = "7"
        }
        button8.setOnClickListener {
            textchamps.text = "8"
        }
        button9.setOnClickListener {
            textchamps.text = "9"
        }
        dotbutton.setOnClickListener {
            textchamps.text = "."
        }
        minusbotton.setOnClickListener {
            textchamps.text = "-"
        }
        dividebutton.setOnClickListener {
            textchamps.text = "/"
        }
        multipybutton.setOnClickListener {
            textchamps.text = "*"
        }
        plusbutton.setOnClickListener {
            textchamps.text = "+"
        }
        equalbutton.setOnClickListener {
            textchamps.text = ""
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val textchamps = findViewById<TextView>(R.id.text)
        val text = textchamps.text.toString();
        outState.putString("textchamps", text)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val textchamps = findViewById<TextView>(R.id.text)
        val text = textchamps.text.toString();
        savedInstanceState.putString("textchamps", text)
    }

}