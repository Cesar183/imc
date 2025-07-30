package com.example.androidmaster.imccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaster.R
import com.example.androidmaster.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultImcActivity : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvImc:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_imc)

        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        initComponent()
        initUI(result)
        initListeners()
    }

    private fun initComponent() {
        tvResult = findViewById(R.id.tvResult)
        tvImc = findViewById(R.id.tvImc)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener{onBackPressed()}
    }

    private fun initUI(result: Double) {
        tvImc.text = result.toString()
        when(result){
            in 0.00..18.5 -> { //Bajo peso
                tvResult.text = getString(R.string.title_peso_bajo)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_bajo))
                tvDescription.text = getString(R.string.descripcion_peso_bajo)
            }
            in 18.51..24.99 -> { //Normal
                tvResult.text = getString(R.string.title_peso_normal)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_normal))
                tvDescription.text = getString(R.string.descripcion_peso_normal)
            }
            in 25.00..29.99 -> { //Sobrepeso
                tvResult.text = getString(R.string.title_peso_obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_sobrepeso))
                tvDescription.text = getString(R.string.descripcion_peso_sobrepeso)
            }
            in 30.00..99.99 -> { //Obesidad
                tvResult.text = getString(R.string.title_peso_obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_obesidad))
                tvDescription.text = getString(R.string.descripcion_peso_obesidad)
            }
            else -> { //Error
                tvImc.text = getString(R.string.error)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_obesidad))
                tvResult.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }
}