package com.joaquingabriel.camangeg.block1.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var firstPass: EditText
    private lateinit var secondPass: EditText
    private lateinit var thirdPass: EditText

    private lateinit var checkAnswers: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstPass = findViewById(R.id.firstPass)
        secondPass = findViewById(R.id.secondPass)
        thirdPass = findViewById(R.id.thirdPass)

        checkAnswers = findViewById(R.id.checkAnswers)

        checkAnswers.setOnClickListener{
            val intent = Intent(this,Main


    }
}