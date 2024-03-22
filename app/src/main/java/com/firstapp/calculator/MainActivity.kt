package com.firstapp.calculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val typedNumber = "Hello, Kotlin!"

        val textView: TextView = findViewById(R.id.YourNumber)
        textView.text = typedNumber
    }
}
