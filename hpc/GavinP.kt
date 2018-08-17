package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class GavinP : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gavin_p)

        val actionbar = supportActionBar
        actionbar!!.title = "Gavin Pringle"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
