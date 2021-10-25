package com.example.rememberme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class EventPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_page)

        val mButton = findViewById<View>(R.id.CreateNew) as Button
        mButton.setOnClickListener {
            startActivity((Intent(this@EventPage, CreateNewEvent::class.java)))
        }
    }
}