package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Johnwest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_johnwest)

        val actionbar = supportActionBar
        actionbar!!.title = "John West"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }

