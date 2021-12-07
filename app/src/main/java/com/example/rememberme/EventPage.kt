package com.example.rememberme

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EventPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_event_page)
        //val intent = intent
        //val title = intent.getStringArrayExtra("Title")
        //val date = intent.getStringArrayExtra("Date")
        //val time = intent.getStringArrayExtra("Time")

        //val textV = findViewById<TextView>(R.id.txtV)
        //textV.text = "Title- "+title+"\nDate- "+date+"\nTime- " +time
        val mButton = findViewById<View>(R.id.CreateNew) as Button
        mButton.setOnClickListener {


                startActivity((Intent(this@EventPage, CreateNewEvent::class.java)))
            }

        }


    }


