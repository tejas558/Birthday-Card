package com.tejas558.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class YourCard : AppCompatActivity() {

    private lateinit var TVbirthdayMessage : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_card)

        TVbirthdayMessage = findViewById(R.id.TVbirthdayMessage)

        val name = intent.getStringExtra("name")
        TVbirthdayMessage.text = "Happy Birthday\n$name"
    }
}