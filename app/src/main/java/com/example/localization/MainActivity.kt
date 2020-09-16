package com.example.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {



lateinit var greetingTextView:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        greetingTextView=findViewById(R.id.textView)
    }



    fun button_pressed(view: View){
        greetingTextView.text=getString(R.string.great)
    }




}


//aaaa
//bbb
//ccccc