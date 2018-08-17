package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Judith : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_judith)

        val actionbar = supportActionBar
        actionbar!!.title = "Judith B. Rommel"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
