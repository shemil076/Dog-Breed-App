package com.example.dogbreedapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val displayCorrect = findViewById<TextView>(R.id.correct)
        val displayWrong = findViewById<TextView>(R.id.wrong)

        var correctCount = intent.getIntExtra("correct",0)
        var incorrectCount = intent.getIntExtra("wrong",0)

        displayCorrect.text = correctCount.toString()
        displayWrong.text = incorrectCount.toString()


    }
}