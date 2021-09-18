package com.example.greet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra("name")
        textView3.text = "$name"
    }

    fun WellWishes(view: View) {
        val intent = Intent(this,WellWishes::class.java)
        startActivity(intent)
    }


}