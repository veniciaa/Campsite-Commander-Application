package com.example.campsitecommanderapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainHomeScreenActivity : AppCompatActivity() {

    val items= arrayOf("Tent","Marshmallows","Flashlight")
    val category= arrayOf("Shelter","Food","Safety")
    val quantity= arrayOf(1,3,2)
    val comments= arrayOf("4-person waterproof","For S'mores(Mega size)","Check batteries(AA)")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val inputItems = findViewById<EditText>(R.id.inputItems)
        val addBtn = findViewById<Button>(R.id.addBtn)


        //add button
        addBtn.setOnClickListener {

            startActivity(intent)
        }

    }


}