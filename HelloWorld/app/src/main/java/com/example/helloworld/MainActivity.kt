package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById(R.id.button) as Button
        var myTextView = findViewById(R.id.textView) as TextView
        var cont:Int = 0

        btnClickMe.setOnClickListener {
            cont++
            //cont += 1
            myTextView.text = "$cont"
            Toast.makeText(this@MainActivity, "Hi Taiza!", Toast.LENGTH_SHORT).show()
        }
    }
}