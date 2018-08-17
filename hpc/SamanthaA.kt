package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SamanthaA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samantha)

        val actionbar = supportActionBar
        actionbar!!.title = "Samantha Ahern"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
