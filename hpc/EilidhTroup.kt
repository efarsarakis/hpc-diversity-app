package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class EilidhTroup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eilidh_troup)

        val actionbar = supportActionBar
        actionbar!!.title = "Eilidh Troup"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
