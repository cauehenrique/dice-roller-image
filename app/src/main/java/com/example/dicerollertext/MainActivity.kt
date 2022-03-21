package com.example.dicerollertext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val rollButton = findViewById<Button>(R.id.button)
    val resultTextView = findViewById<TextView>(R.id.resultText)

    rollButton.setOnClickListener {
      val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
      toast.show()

      resultTextView.text = generateRandomNumber(6).toString()
    }
  }

  private fun generateRandomNumber(numberOfSides: Int): Int {
    return (1..numberOfSides).random()
  }
}