package com.example.zachekni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Checklist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checklist)
        //body
        val ImageView = findViewById<ImageView>(R.id.imageView37)

        ImageView.setOnClickListener {
            startActivity(Intent(this, Delo::class.java))
            finish()
        }
        //body
    }

}