package com.tesco.teamstorefullfillment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity ()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main) // Render the main activity

        //Click event
        btnShowMainActivity.setOnClickListener {
            //code
            Log.i("MainActivity","Button was clicked !!") // to show the logs in Android studio
            Toast.makeText(this, "Button was clicked !!", Toast.LENGTH_SHORT).show() // to show the log to the user
        }

        btnSendMessageShowMainActivity.setOnClickListener {
            Log.i("MainActivity","Send message to next page button was clicked") // to show the logs in Android studio
            //Toast.makeText(this, "Send message to next page button was clicked",Toast.LENGTH_SHORT).show()  // to show the log to the user
            val enteredmsg : String = etUserMessageMainActivity.text.toString()  // variable definition and get value from entered textfield
            //Toast.makeText(this, enteredmsg,Toast.LENGTH_SHORT).show()  // to show the log to the user

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("key_etUserMessageMA",enteredmsg)
            startActivity(intent)
        }
    }
}
