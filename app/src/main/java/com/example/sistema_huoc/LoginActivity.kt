package com.example.sistema_huoc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    lateinit var botaoEntrar: Button
    lateinit var campoEmail: EditText
    lateinit var campoSenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        botaoEntrar = findViewById(R.id.btnLogin)
        campoEmail = findViewById(R.id.editTextEmail)
        campoSenha = findViewById(R.id.editTextSenha)

        botaoEntrar.setOnClickListener {
            val email = campoEmail.text.toString().trim()
            val senha = campoSenha.text.toString()

            when (email) {
                "admin@email.com" -> {
                   // startActivity(Intent(this, AdminActivity::class.java))
                }
                "medico@email.com" -> {
                    startActivity(Intent(this, MedicoActivity::class.java))
                }
                "enfermeiro@email.com" -> {
                    startActivity(Intent(this, EnfermeiroActivity::class.java))
                }
                else -> {
                    Toast.makeText(this, "Email não reconhecido", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
