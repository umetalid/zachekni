package com.example.zachekni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        //body
        val textView = findViewById<TextView>(R.id.signin)

        textView.setOnClickListener {
            startActivity(Intent(this, Signin::class.java))
            finish()
        }
        //body
    }
}