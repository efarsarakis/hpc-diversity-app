package com.example.studio.hpc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_become.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        About.setOnClickListener {
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)


        }

        faces.setOnClickListener {
            val intent = Intent(this, Faces::class.java)
            startActivity(intent)


        }

        best.setOnClickListener {
            val intent = Intent(this, BestPracticeGuides::class.java)
            startActivity(intent)

        }

        become.setOnClickListener {
            val intent = Intent(this, Become::class.java)
            startActivity(intent)
        }

        become2.setOnClickListener {
            val intent = Intent(this, Become::class.java)
            startActivity(intent)

        }
        become3.setOnClickListener {
            val intent = Intent(this, Become::class.java)
            startActivity(intent)

        }



        best2.setOnClickListener {
            val intent = Intent(this, BestPracticeGuides::class.java)
            startActivity(intent)

        }

        best3.setOnClickListener {
            val intent = Intent(this, BestPracticeGuides::class.java)
            startActivity(intent)

        }
        about2.setOnClickListener {
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)


        }
        about3.setOnClickListener {
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)


        }

        faces2.setOnClickListener {
            val intent = Intent(this, Faces::class.java)
            startActivity(intent)


        }

        faces3.setOnClickListener {
            val intent = Intent(this, Faces::class.java)
            startActivity(intent)


        }





    }
    }
