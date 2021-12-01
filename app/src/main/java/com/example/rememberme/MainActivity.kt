package com.example.rememberme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PreferenceManager.setDefaultValues(this, R.xml.root_preferences, false)

        val mButton = findViewById<View>(R.id.Nextbutton) as Button
        mButton.setOnClickListener {
            startActivity((Intent(this@MainActivity, EventPage::class.java)))

    }
        val SButton = findViewById<View>(R.id.SettingsBT) as Button
        SButton.setOnClickListener {
            startActivity((Intent(this@MainActivity, SettingsActivity::class.java)))
        }

    }

    }

