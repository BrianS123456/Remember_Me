package com.example.rememberme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class EventPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_page)

        val mButton = findViewById<Button>(R.id.newBT)
        mButton.setOnClickListener {


            startActivity((Intent(this@EventPage, CreateNewEvent::class.java)))
        }

        val intent = getIntent()
        val title = intent.getStringExtra("Title")
        val date = intent.getStringExtra("Date")
        val time = intent.getStringExtra("Time")

        val textV = findViewById<TextView>(R.id.txtV)
        textV.text = "Title: "+title+"\nDate: "+date+"\nTime: " +time



        }


    }


