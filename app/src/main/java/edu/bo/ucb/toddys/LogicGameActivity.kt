package edu.bo.ucb.toddys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LogicGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logic_game)
        val btnLanzar: Button = findViewById(R.id.btnLanzar)

        btnLanzar.setOnClickListener{
            //Toast.makeText(this, "PRESIONO EL BOTON", Toast.LENGTH_LONG).show()
            tiempo()
        }
        rollDice()
    }

    private fun rollDice(){
        var numero: Int = lanzar(6)
        var txtResult: TextView = findViewById(R.id.txtResultado)
        txtResult.text = numero.toString()

        val drawableResource = when(numero){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val imgDado: ImageView = findViewById(R.id.imgDado)
        imgDado.setImageResource(drawableResource)

        var txtDatos: TextView = findViewById(R.id.txtDatos)

        val opcion1:String = "Accion 1"
        val opcion2:String = "Accion 2"
        val opcion3:String = "Accion 3"
        val opcion4:String = "Accion 4"
        val opcion5:String = "Accion 5"
        val opcion6:String = "Accion 6"

        when(numero){
            1-> txtDatos.text = opcion1
            2-> txtDatos.text = opcion2
            3-> txtDatos.text = opcion3
            4-> txtDatos.text = opcion4
            5-> txtDatos.text = opcion5
            else -> txtDatos.text = opcion6
        }
    }

    private fun lanzar(max: Int): Int{
        return (1..max).random()
    }

    private fun tiempo(){
        object: CountDownTimer(3000, 150){
            override fun onTick(p0: Long) {
                rollDice()
            }

            override fun onFinish() {

            }
        }.start()
    }
}