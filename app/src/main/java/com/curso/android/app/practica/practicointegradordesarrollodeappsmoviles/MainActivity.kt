package com.curso.android.app.practica.practicointegradordesarrollodeappsmoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding = ActivityMainBiding.inflate(layoutInflater)

        /*binding.button.onClickListener{

        }*/

        findViewById<Button>(R.id.button)
            .setOnClickListener {

            }

    }
}