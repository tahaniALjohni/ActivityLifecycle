package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var tvMain: TextView
    private var str: String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain= findViewById(R.id.mainTV)
    }
    override fun onStart() {
        str+= "I am Online\n"
        tvMain.text= str
        super.onStart()
    }


    override fun onStop() {
        val currentDate = SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date())
        str+= "$currentDate\n"
        tvMain.text= str
        super.onStop()
    }
}