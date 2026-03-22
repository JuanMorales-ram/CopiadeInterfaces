package com.example.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ui.R
import com.example.ui.main.MainActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val mensajeRegistrate = findViewById<TextView>(R.id.MensajeRegistrate)



        mensajeRegistrate.setOnClickListener {

            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }


        findViewById<Button>(R.id.btnIngresarLogin).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}