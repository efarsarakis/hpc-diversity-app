package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MartinR : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_martin_r)

        val actionbar = supportActionBar
        actionbar!!.title = "Martin Rüfenacht"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
