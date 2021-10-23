package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Soma.setOnClickListener{calculator()}
        binding.Subtracao.setOnClickListener{calculator()}
        binding.Multiplicacao.setOnClickListener{calculator()}
        binding.Divisao.setOnClickListener{calculator()}
        //TODO onClick Listener
    }

    fun calculator():Double{
        val number1 = binding.Number1.text.toString().toDouble()
        val number2 = binding.Number2.text.toString().toDouble()
        val radiogroupchecked = binding.radioGroup.checkedRadioButtonId
        val resultado = when (radiogroupchecked){
            R.id.Soma -> calculadora().somar(number1, number2)
            R.id.Subtracao -> calculadora().subtrair(number1, number2)
            R.id.Multiplicacao -> calculadora().multiplicar(number1, number2)
            else -> calculadora().dividir(number1, number2)
        }
        binding.Resultado.text = resultado.toString()
        return(resultado)
    }
class calculadora{
    fun somar(number1: Double, number2: Double): Double {
        var soma = number1 + number2
        return(soma)
    }
    fun subtrair(number1: Double, number2: Double): Double {
        var subtracao = number1 - number2
        return(subtracao)
    }
    fun multiplicar(number1: Double, number2: Double): Double {
        var multiplicacao = number1 * number2
        return(multiplicacao)
    }
    fun dividir(number1: Double, number2: Double): Double {
        var divisao = number1 / number2
        return(divisao)
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