package com.example.studio.hpc

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class video : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        

        val filePlace = "android.resource://" + packageName + "/raw/" + R.raw.video

        val videoView = findViewById<View>(R.id.videoView) as VideoView

        videoView.setVideoURI(Uri.parse(filePlace))

        videoView.setMediaController(MediaController(this))

        videoView.start()

        val actionbar = supportActionBar
        actionbar!!.title = "Supercomputing video"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }

    }
