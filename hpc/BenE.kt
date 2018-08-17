package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class BenE : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ben_e)

        val actionbar = supportActionBar
        actionbar!!.title = "Ben eagan"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
