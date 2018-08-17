package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Diversity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diversity)



        val actionbar = supportActionBar
        actionbar!!.title = " Diversity best practice guide"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }

