package edu.bo.ucb.toddys

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val btnAtrasVista4: Button = findViewById(R.id.btnAtrasVista4)

        btnAtrasVista4.setOnClickListener{
            startActivity(Intent(this,ThirdActivity::class.java))
        }

        val btnContinuar: Button = findViewById(R.id.btnContinuar)

        btnContinuar.setOnClickListener {
            startActivity(Intent(this,LogicGameActivity::class.java))
        }
    }
}