package com.example.dicerollerapp_easy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            //呼叫 fun rollDice()
            rollDice()
        }
    }

    private fun rollDice() {
        // 宣告骰子有 6 面
        val dice = Dice(6)
        // 呼叫 dice.roll() 並將結果存於 diceRoll
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        // 將 diceRoll 內之值轉為 String ,並存至resultTextView.text
        resultTextView.text = diceRoll.toString()
    }
}
class Dice (private val numSides:Int){
    fun roll():Int{
        // 隨選 1 ~ numSides 一數，並回傳
        return  (1..numSides).random()
    }
}