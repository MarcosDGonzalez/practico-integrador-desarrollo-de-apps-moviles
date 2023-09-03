package com.curso.android.app.practica.practicointegradordesarrollodeappsmoviles

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Test


import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class ExampleUnitTest {

    private lateinit var comparador: Comparador
    @get:Rule
    val instantTaskRule=InstantTaskExecutorRule()
    private val dispacher= StandardTestDispatcher()

    @Before
    fun setup(){
        Dispatchers.setMain(dispacher)
        comparador= Comparador()
    }
    @After
    fun tearDown(){
        Dispatchers.resetMain()
    }

    @Test
    fun comparar()= runTest{

        val resultado=comparador.comparar("a","a")
        assertEquals(resultado,"Ambos textos son iguales")
    }
}