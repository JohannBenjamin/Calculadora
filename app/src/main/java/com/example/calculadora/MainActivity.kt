package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

class Calculadora{
    fun Somar(n1 : Int, n2 : Int){
        var soma = n1 + n2
        return(soma)

    }
}
    /*val editTextN1 = findViewById<EditText>(R.id.Number1)
    val editTextN2 = findViewById<EditText>(R.id.Number2)

    val n1: Float = editTextN1.text.toString().toFloat()
    val n2: Float = editTextN2.text.toString().toFloat()

    val radiobuttonsoma = findViewById<RadioButton>(R.id.Soma)
    val soma = radiobuttonsoma.isSelected
    val radiobuttonsubtracao = findViewById<RadioButton>(R.id.Subtracao)
    val subtracao = radiobuttonsubtracao.isSelected
    val radiobuttonmultiplicacao = findViewById<RadioButton>(R.id.Multiplicacao)
    val multiplicacao = radiobuttonmultiplicacao.isSelected
    fun radiobuttonclicked(View: View) {
        when {
            soma -> {
                val total = n1 + n2
                val resultado: TextView = findViewById(R.id.Resultado)
                resultado.text = total.toString()
            }
            subtracao -> {
                val total = n1 - n2
                val resultado: TextView = findViewById(R.id.Resultado)
                resultado.text = total.toString()
            }
            multiplicacao -> {
                val total = n1 * n2
                val resultado: TextView = findViewById(R.id.Resultado)
                resultado.text = total.toString()
            }
            else -> {
                val total = n1 / n2
                val resultado: TextView = findViewById(R.id.Resultado)
                resultado.text = total.toString()
            }
        }*/
        /*if(soma){
            val total = n1 + n2
            val resultado: TextView = findViewById(R.id.Resultado)
            resultado.text = total.toString()
        }
        else {
            if (subtracao) {
                val total = n1 - n2
                val resultado: TextView = findViewById(R.id.Resultado)
                resultado.text = total.toString()
            }
            else {
                if (multiplicacao) {
                    val total = n1 * n2
                    val resultado: TextView = findViewById(R.id.Resultado)
                    resultado.text = total.toString()
                }
                else{
                    val total = n1 / n2
                    val resultado: TextView = findViewById(R.id.Resultado)
                    resultado.text = total.toString()
                }
            }
        }*/
        /*if (View is RadioButton) {
            // Is the button now checked?
            //val checked = View.isChecked

            // Check which radio button was clicked
            when (View.getId()) {
                R.id.Soma ->
                    if (soma)
                    {
                        val total = n1 + n2
                        val resultado: TextView = findViewById(R.id.Resultado)
                        resultado.text = total.toString()
                    }
                R.id.Subtracao ->
                    if (checked) {
                        // Ninjas rule
                    }
                R.id.Multiplicacao ->
                    if (checked) {
                        // Pirates are the best
                    }
                else ->
                    if (checked) {
                        // Ninjas rule
                    }
            }
        }
    }*/
}