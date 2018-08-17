package com.example.studio.hpc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class anhkoa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anhkoa)

        val actionbar = supportActionBar
        actionbar!!.title = "Nguyen Anh Khoa Doan"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
