package com.example.zachekni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        //body
        val textView = findViewById<TextView>(R.id.signin)

        textView.setOnClickListener {
            startActivity(Intent(this, signin::class.java))
            finish()
        }
        //body
    }
}