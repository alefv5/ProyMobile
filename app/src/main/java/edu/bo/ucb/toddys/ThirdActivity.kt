package edu.bo.ucb.toddys

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val btnAtrasVista3: Button = findViewById(R.id.btnAtrasVista3)

        btnAtrasVista3.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }

        val btnOpcion2: Button = findViewById(R.id.btnOpcion2)

        btnOpcion2.setOnClickListener {
            startActivity(Intent(this,FourthActivity::class.java))
        }
    }
}