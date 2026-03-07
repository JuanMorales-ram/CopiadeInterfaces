package com.example.talle2_juanmorales

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val btnComienzaIntro = findViewById<Button>(R.id.btnComienzaIntro)
        val tvRegistrateIntro = findViewById<TextView>(R.id.tvRegistrateIntro)

        btnComienzaIntro.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

        tvRegistrateIntro.setOnClickListener {

            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)

        }
    }
}