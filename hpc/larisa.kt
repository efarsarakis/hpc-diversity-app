package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class larisa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_larisa)

        val actionbar = supportActionBar
        actionbar!!.title = "Larisa Stoltzfus"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
