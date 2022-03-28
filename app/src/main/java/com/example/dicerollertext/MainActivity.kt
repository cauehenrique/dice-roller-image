package com.example.dicerollertext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val rollButton = findViewById<Button>(R.id.button)
    val diceImage = findViewById<ImageView>(R.id.imageView)

    rollButton.setOnClickListener {
      val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
      toast.show()

      val diceImages = arrayOf<Int>(
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6
      )

      val newNumber = generateRandomNumber(6)
      diceImage.setImageResource(diceImages[newNumber - 1])
    }
  }

  private fun generateRandomNumber(numberOfSides: Int): Int {
    return (1..numberOfSides).random()
  }
}