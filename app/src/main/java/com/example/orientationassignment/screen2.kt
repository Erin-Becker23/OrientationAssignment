package com.example.orientationassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class screen2 : AppCompatActivity() {

    lateinit var result:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        result = findViewById(R.id.text_output_result) //text box

        val text = intent.getStringExtra("EXTRA_TEXT") //intent

        var output = "$text"

        result.text = output

    }
}