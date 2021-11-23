package com.example.zachekni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        //body
        val ImageView = findViewById<ImageView>(R.id.imageView9)

        ImageView.setOnClickListener {
            startActivity(Intent(this, Checklist::class.java))
            finish()
        }
        //body
    }
}