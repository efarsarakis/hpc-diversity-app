package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CianBooth : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cian_booth)

        val actionbar = supportActionBar
        actionbar!!.title = "Cian Booth"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }

