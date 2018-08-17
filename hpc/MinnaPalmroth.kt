package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MinnaPalmroth : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minna_palmroth)

        val actionbar = supportActionBar
        actionbar!!.title = "Minna Palmroth"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
