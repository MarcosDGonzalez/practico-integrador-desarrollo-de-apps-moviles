package com.curso.android.app.practica.practicointegradordesarrollodeappsmoviles

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Comparador : AppCompatActivity() {
    
    fun comparar(texto1: String, texto2: String): String {


        val text1 = texto1
        if (text1.isNotEmpty()){
            val text2 = texto2
            if (text2.isNotEmpty()){
                if (text1.toString() == text2.toString()){
                    return "Ambos textos son iguales"
                }
                else{
                    return "Ambos textos son diferentes"
                }
            }
            else{
                return "No puede haber campos vacios"
            }
        }
        else{
            return "No puede haber campos vacios"
        }
    }
}