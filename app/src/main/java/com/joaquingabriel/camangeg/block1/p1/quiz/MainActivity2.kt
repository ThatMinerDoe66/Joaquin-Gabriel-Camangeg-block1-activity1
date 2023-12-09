package com.joaquingabriel.camangeg.block1.p1.quiz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    private lateinit var imageLink: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageLink = findViewById(R.id.imageLink)

        imageLink.setOnClickListener {
            openYouTubeVideo()
        }
    }

    private fun openYouTubeVideo() {
        val youtubeVideoUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeVideoUrl))
        startActivity(intent)
    }
}