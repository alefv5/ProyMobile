package edu.bo.ucb.toddys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnAtras: Button = findViewById(R.id.btnAtras)

        btnAtras.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        val btnLocal: Button = findViewById(R.id.btnLocal)

        btnLocal.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}