package com.example.androidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaster.firstapp.FirstAppActivity
import com.example.androidmaster.imccalculator.ImcCalculatorActivity
import com.example.androidmaster.superhero.SuperHeroListActivity
import com.example.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnImcApp)
        val btnTodo = findViewById<Button>(R.id.btnTodo)
        val btnSuperHero = findViewById<Button>(R.id.btnSuperHero)

        btnSaludApp.setOnClickListener{ navigateToSaludApp() }
        btnImcApp.setOnClickListener{ navigateToImcApp() }
        btnTodo.setOnClickListener { navigateToTodoApp() }
        btnSuperHero.setOnClickListener { navigateToSuperHeroApp() }
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}