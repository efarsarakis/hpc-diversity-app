package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class guido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guido)

        val actionbar = supportActionBar
        actionbar!!.title = "Guido Falk Von Rudorff"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
