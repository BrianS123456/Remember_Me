package com.example.rememberme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class CreateNewEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_event)

        val mButton = findViewById<View>(R.id.Newbt) as Button
        mButton.setOnClickListener {
            startActivity((Intent(this@CreateNewEvent, EventPage::class.java)))
        }
    }
}