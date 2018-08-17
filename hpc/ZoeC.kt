package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ZoeC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoe_c)

        val actionbar = supportActionBar
        actionbar!!.title = "Zoe Cournia"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}