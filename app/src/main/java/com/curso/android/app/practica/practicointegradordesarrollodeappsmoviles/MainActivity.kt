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

        val texto1 = findViewById<EditText>(R.id.EditText1)
        val texto2 = findViewById<EditText>(R.id.EditText2)
        val resultado=findViewById<TextView>(R.id.resultado)

        findViewById<Button>(R.id.button)
            .setOnClickListener {
                val text1 = texto1.text
                if (text1.isNotEmpty()){
                    val text2 = texto2.text
                    if (text2.isNotEmpty()){
                        if (text1.toString() ==text2.toString()){
                            resultado.text="Ambos textos son iguales"
                        }
                        else{
                            resultado.text="Ambos textos son diferentes"
                        }
                        }
                    else{
                        resultado.text="No puede haber campos vacios"
                    }
                }
                else{
                    resultado.text="No puede haber campos vacios"
                }

            }

    }
}