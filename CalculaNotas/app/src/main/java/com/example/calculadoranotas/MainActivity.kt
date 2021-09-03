package com.example.calculadoranotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculadoranotas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val id = v.id
        if (id == R.id.buttonCalculate) {
            calculate()
        }
    }


    private fun calculate() {
        val nota1 = binding.nota1.text.toString().toFloat()
        val nota2 = binding.nota2.text.toString().toFloat()
        val media = (nota2 + nota1) / 2
        val faltas = binding.nfaltas.text.toString().toInt()

        if (media >= 6 && faltas <= 10) {
            binding.resultado.setText(
                "Aluno foi Aprovado" + "\n" + "Nota Final:" + media +
                        "\n" + "Faltas:" + faltas
            )
            binding.resultado.setTextColor(Color.GREEN)
        } else {
            binding.resultado.setText(
                "Aluno foi Reprovado" + "\n" + "Nota Final:" + media +
                        "\n" + "Faltas:" + faltas
            )
            binding.resultado.setTextColor(Color.RED)
        }
    }
}