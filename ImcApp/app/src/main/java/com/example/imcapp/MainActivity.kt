package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import com.example.imcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        binding.alturaEDT.doAfterTextChanged { text ->
            // Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        binding.pesoEDT.doOnTextChanged { text, _, _, _ ->
            // binding.titleTXT.text = text
        }
        binding.calcularBTN.setOnClickListener{
            calcularIMC(binding.pesoEDT.text.toString(), binding.alturaEDT.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if(peso != null && altura != null){
            val imc = peso/(altura*altura)
            binding.titleTXT.text = "Seu IMC é %.2f:".format(imc)
        }
    }
}