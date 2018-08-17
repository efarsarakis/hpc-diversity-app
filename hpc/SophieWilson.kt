package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SophieWilson : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sophie_wilson)

        val actionbar = supportActionBar
        actionbar!!.title = "Sophie Wilson"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }

