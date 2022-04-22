package com.tejas558.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var ETnameInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ETnameInput = findViewById(R.id.ETnameInput)
    }

    fun generateBC(view: View) {
        val name = ETnameInput.text.toString()
        val intent = Intent(this, YourCard::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }
}