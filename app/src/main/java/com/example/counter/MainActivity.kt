package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var id = 26
    lateinit var value: TextView
    lateinit var plus: Button
    lateinit var minus: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        value = findViewById(R.id.value)

        plus = findViewById(R.id.plus)
        minus =  findViewById(R.id.minus)

        value.text = "" + id

        plus.setOnClickListener {
            value.text = ""+ ++id
        }
        minus.setOnClickListener {
            value.text = ""+ --id
        }
    }
}