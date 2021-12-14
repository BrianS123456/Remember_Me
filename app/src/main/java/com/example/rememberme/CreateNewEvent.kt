package com.example.rememberme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CreateNewEvent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_event)
        val timeText = findViewById<EditText>(R.id.timeT)
        val dateText = findViewById<EditText>(R.id.dateD)
        val titleText = findViewById<EditText>(R.id.eventE)
        val mButton = findViewById<Button>(R.id.CreateNewBT)
        mButton.setOnClickListener {
            val time = timeText.text.toString()
            val date = dateText.text.toString()
            val title = titleText.text.toString()

            val intent = Intent(this, EventPage::class.java)
            intent.putExtra("Title", title)
            intent.putExtra("Date", date)
            intent.putExtra("Time", time)
            startActivity(intent)

        }
        //val mButton = findViewById<Button>(R.id.Newbt)
        //startActivity((Intent(this@CreateNewEvent, EventPage::class.java)))

    }

        //mButton.setOnClickListener {

            //startActivity((Intent(this@CreateNewEvent, EventPage::class.java)))

        }


