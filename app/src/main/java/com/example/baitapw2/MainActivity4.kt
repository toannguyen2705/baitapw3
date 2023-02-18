package com.example.baitapw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            val intent: Intent = Intent (this, NewActivity::class.java)
            startActivity(intent)

        }
    }
}