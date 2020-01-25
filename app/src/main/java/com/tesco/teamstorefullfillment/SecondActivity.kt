package com.tesco.teamstorefullfillment

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity ()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras

        // get entered text from main activity and assign to variable - messagefromMA
        //val messagefromMA = intent.extras!!.getString("key_etUserMessageMA")
        val messagefromMA = bundle!!.getString("key_etUserMessageMA")
        //Toast.makeText(this, "Hello welcome to 2nd activity", Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, messagefromMA,Toast.LENGTH_SHORT).show()

        //assign the value of variable - messagefromMA to the text view - txvEnteredMsgfromMA
        txvEnteredMsgfromMA.text = messagefromMA
        //txvEnteredMsgfromMA.text = "Welcome to second activity"
    }
}