package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class AlanTuring : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alan_turing)

        val actionbar = supportActionBar
        actionbar!!.title = "Alan Turing"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }

