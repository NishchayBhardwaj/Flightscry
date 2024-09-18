package com.example.flightscry

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.flightscry.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to activity_main.xml
        setContentView(R.layout.activity_main)
    }
}
