package com.example.studio.hpc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_become.*


class Become : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_become)

        sendemail.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)

            intent.type = "text/html"

            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf<String>("info@hpc-diversity.ac.uk"))

            intent.putExtra(Intent.EXTRA_SUBJECT, "Faces of HPC interview questions ")
            intent.putExtra(Intent.EXTRA_TEXT, "Interviewee name: \n " +"\n"+ "\n"+
                    " Photograph: Please provide a photograph for use alongside your interview. We encourage the use of ‘fun’ pictures that showcase your personality. For examples see: http://www.hpc-diversity.ac.uk/faces-of-hpc \n" +"\n"+
                    "Affiliations: \n"+"\n"+"\n"+
                    "Tell us a bit about yourself – where you’re from, what you’ve studied and where, and what some of your outside interests are.\n"+"\n"+"\n"+
                    "What is your current job? Describe what you do in HPC. Is this your main interest, or something you fell into?\n" +"\n"+"\n"+
                    "How did you become interested in HPC? Briefly describe your path into HPC.\n" +"\n"+"\n"+
                    "As part of this project we want to celebrate the diversity of HPC, in particular to promote equality across the nine “protected” characteristics of the UK Equality Act, which are replicated in world-wide equality legislation. Do you feel an affiliation with this matter, and if so how has this interacted with or impacted your job in the HPC community?’\n" +
                    "For information the protected characteristics are:\n" +
                    "• Age\n" +
                    "• Disability\n" +
                    "• Sex\n" +
                    "• Race\n" +
                    "• Religion or belief\n" +
                    "• Pregnancy and maternity\n" +
                    "• Marriage and civil partnership\n" +
                    "• Sexual orientation\n" +
                    "• Gender reassignment\n"  + "\n"+"\n"+"\n"+
                    "Is there something about you that’s given you a unique or creative approach to what you do?\n"+"\n"+"\n"+
                    "Were there any challenges when you first entered the field? How have you overcome these, or do they continue to challenge you?\n"+"\n"+"\n"+
                    "What’s the best thing about working in HPC?\n"+"\n"+"\n"+
                    "If there’s one thing about HPC you could change, what would it be?\n"+ "\n"+"\n"+
                    "What’s next for you in HPC – where does your career lead you?\n" + "\n"+"\n"

            )



            startActivity(intent)


        }
emailus.setOnClickListener{
    val intent = Intent(Intent.ACTION_SEND)

    intent.type="text/html"
    intent.putExtra(Intent.EXTRA_EMAIL, arrayOf<String>("info@hpc-diversity.ac.uk") )
    intent.putExtra(Intent.EXTRA_SUBJECT, "Faces of HPC- recommend someone")

    startActivity(intent)
}



            sign.setOnClickListener {
                val intent = Intent(this, Newsletter::class.java)
                startActivity(intent)
            }


            val actionbar = supportActionBar
            actionbar!!.title = "Become a face of HPC"
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setDisplayHomeAsUpEnabled(true)
        }
        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }
    }









