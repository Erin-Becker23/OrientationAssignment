package com.example.orientationassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var enterText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button_click)
        enterText = findViewById(R.id.enter_text)
        var saveText = ""

        button.setOnClickListener {
            saveText = enterText.text.toString()
            Intent(this@MainActivity, screen2::class.java).also {
                it.putExtra("EXTRA_TEXT", saveText)
                startActivity(it)

            }
        }
    }
}