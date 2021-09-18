package com.example.greet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_well_wishes.*

class WellWishes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_well_wishes)

        val name = intent.getStringExtra("name")
        textView4.text = "It takes a long time to become \nyoung.And in the end, it’s not \nthe years in your life that count.\n It’s the life in your years\n\n\n Athresh"
    }
}