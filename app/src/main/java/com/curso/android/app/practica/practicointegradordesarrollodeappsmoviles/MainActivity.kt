package com.curso.android.app.practica.practicointegradordesarrollodeappsmoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val comp = Comparador()
        val texto1 = findViewById<EditText>(R.id.EditText1)
        val texto2 = findViewById<EditText>(R.id.EditText2)
        val resultado=findViewById<TextView>(R.id.resultado)

        findViewById<Button>(R.id.button)
            .setOnClickListener {
                resultado.text=comp.comparar(texto1.text.toString(), texto2.text.toString())

            }

    }
}