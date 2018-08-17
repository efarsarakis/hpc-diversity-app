package com.example.studio.hpc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_faces.*
import kotlinx.android.synthetic.main.activity_main.*


class Faces : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faces)

        johnbutton.setOnClickListener {
            val intent = Intent(this, Johnwest::class.java)
            startActivity(intent)

        }

        minnabutton.setOnClickListener {
            val intent = Intent(this, MinnaPalmroth::class.java)
            startActivity(intent)

        }

        alanbutton.setOnClickListener {
            val intent = Intent(this, AlanTuring::class.java)
            startActivity(intent)

        }

        cianbutton.setOnClickListener {
            val intent = Intent(this, CianBooth::class.java)
            startActivity(intent)

        }

        sophiebutton.setOnClickListener {
            val intent = Intent(this, SophieWilson::class.java)
            startActivity(intent)

        }

        martinbutton.setOnClickListener{
            val intent = Intent (this, MartinR::class.java)
            startActivity(intent)
        }

        idabutton.setOnClickListener {
            val intent = Intent(this, IdaRhodes::class.java)
            startActivity(intent)

        }

        guidobutton.setOnClickListener {
            val intent = Intent(this, guido::class.java)
            startActivity(intent)

        }

        judithbutton.setOnClickListener {
            val intent = Intent(this, Judith::class.java)
            startActivity(intent)

        }

        Katherinehbutton.setOnClickListener {
            val intent = Intent(this, katherine::class.java)
            startActivity(intent)

                }

        anhbutton.setOnClickListener {
            val intent = Intent(this, anhkoa::class.java)
            startActivity(intent)

                        }
                larisabutton.setOnClickListener {
                    val intent = Intent(this, larisa::class.java)
                    startActivity(intent)

                }

                        Eilidhbutton.setOnClickListener {
                            val intent = Intent(this, EilidhTroup::class.java)
                            startActivity(intent)

                        }
                                Zoebutton.setOnClickListener {
                                    val intent = Intent(this, ZoeC::class.java)
                                    startActivity(intent)

                                }
                                        Samanthabutton.setOnClickListener {
                                            val intent = Intent(this, SamanthaA::class.java)
                                            startActivity(intent)

                                        }

                                        Mikebutton.setOnClickListener {
                                            val intent = Intent(this, MichaelR::class.java)
                                            startActivity(intent)

                                        }

                                        Gavinbutton.setOnClickListener {
                                            val intent = Intent(this, GavinP::class.java)
                                            startActivity(intent)

                                        }
        Benbutton.setOnClickListener {
            val intent = Intent(this, BenE::class.java)
            startActivity(intent)

        }






        val actionbar = supportActionBar
        actionbar!!.title = "Faces of HPC"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    }

