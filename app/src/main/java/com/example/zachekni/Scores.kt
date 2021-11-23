package com.example.zachekni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Scores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores)
        //body
        val ImageView = findViewById<ImageView>(R.id.imageView38)

        ImageView.setOnClickListener {
            startActivity(Intent(this, Stars::class.java))
            finish()
        }
        //body
    }
}