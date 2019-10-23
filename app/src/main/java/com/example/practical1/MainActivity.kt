package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }


    private fun rollDice(){

        //val randomInt2 = Random().nextInt(6) + 1
        //val randomInt3 = Random().nextInt(6) + 1


        Toast.makeText(this,"button clicked",
            Toast.LENGTH_SHORT).show()

        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        val diceImage3: ImageView = findViewById(R.id.dice_image3)



        diceImage.setImageResource(randomNum())
        diceImage2.setImageResource(randomNum())
        diceImage3.setImageResource(randomNum())

        //val resultText2: TextView = findViewById(R.id.result_text2)
        //val resultText3: TextView = findViewById(R.id.result_text3)
        //resultText.text = "Dice Rolled!"
        //resultText2.text = "Dice Rolled!"
        //resultText3.text = "Dice Rolled!"

        //resultText.text = randomInt.toString()
        //resultText2.text = randomInt2.toString()
        //resultText3.text = randomInt3.toString()
    }

    private fun randomNum(): Int {
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return drawableResource
    }

}
