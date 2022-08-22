package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<android.widget.Button>(R.id.helloBtn)
        button.setOnClickListener {
            Log.v("Hello world", "Button clicked!")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}