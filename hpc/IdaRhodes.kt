package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class IdaRhodes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ida_rhodes)

        val actionbar = supportActionBar
        actionbar!!.title = "Ida Rhodes"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
