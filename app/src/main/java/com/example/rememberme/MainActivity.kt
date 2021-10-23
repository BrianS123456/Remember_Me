package com.example.rememberme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val mButton = findViewById<View>(R.id.Nextbutton) as Button
    mButton.setOnClickListener {
        startActivity((Intent(this@MainActivity, EventPage::class.java)))
    }

    }
}