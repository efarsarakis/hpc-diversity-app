package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Accessibility : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accessibility)

        val actionbar = supportActionBar
        actionbar!!.title = "Accessibility practice guide"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
