package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MichaelR : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_michael_r)

        val actionbar = supportActionBar
        actionbar!!.title = "Michael Ruggiero"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
