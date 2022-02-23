package com.example.dogbreedapp

import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val displayCorrect = findViewById<TextView>(R.id.correct)
        val displayWrong = findViewById<TextView>(R.id.wrong)

        var correctCount = intent.getIntExtra("correct",0)
        var incorrectCount = intent.getIntExtra("wrong",0)

        var trophy = findViewById<ImageView>(R.id.trophy)
        trophy.setImageResource(R.drawable.trophy)



        displayCorrect.text = "Number of correct selections: " + correctCount.toString()
        displayCorrect.setTextColor(Color.GREEN)

        displayWrong.text = "Number of incorrect selections: " + incorrectCount.toString()

        displayWrong.setTextColor(Color.RED)
    }
}