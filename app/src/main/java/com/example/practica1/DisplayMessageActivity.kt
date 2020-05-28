package com.example.practica1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        /**agregamos el nuevo intent*/

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        /**capturamos el layaout del textView*/
        val textView= findViewById<TextView>(R.id.textView).apply{
            text = message
        }
    }



}
