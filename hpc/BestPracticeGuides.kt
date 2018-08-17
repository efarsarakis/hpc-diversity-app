package com.example.studio.hpc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.accessibility.AccessibilityEvent
import kotlinx.android.synthetic.main.activity_best_practice_guides.*

class BestPracticeGuides : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_practice_guides)

        accessibility.setOnClickListener {
            val intent = Intent(this, Accessibility::class.java)
            startActivity(intent)

            diversity.setOnClickListener {
                val intent = Intent(this, Diversity::class.java)
                startActivity(intent)
            }

        }



        val actionbar = supportActionBar
        actionbar!!.title = "Best Practice guides"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

