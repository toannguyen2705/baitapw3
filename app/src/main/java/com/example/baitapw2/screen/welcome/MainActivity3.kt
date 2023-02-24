package com.example.baitapw2.screen.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.baitapw2.R
import com.example.baitapw2.screen.login.newActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val img = findViewById<ImageView>(R.id.imageNext3)
        img.setOnClickListener {
            val intent: Intent = Intent (this, welcome::class.java)
            startActivity(intent)

        }
    }
}