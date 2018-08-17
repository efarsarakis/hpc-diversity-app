package com.example.studio.hpc



import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Newsletter : AppCompatActivity(), View.OnClickListener {



    lateinit var editTextName: EditText
    lateinit var buttonClickMe: Button
    lateinit var textViewMessage : TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newsletter)

        editTextName= findViewById(R.id.editTextName)
        buttonClickMe= findViewById(R.id.buttonClickMe)
        textViewMessage=findViewById(R.id.textViewMessage)

        buttonClickMe.setOnClickListener(this)




        val actionbar = supportActionBar
        actionbar!!.title = "Newsletter"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)





    }

    override fun onClick(p0: View?) {
        val name = editTextName.text
        textViewMessage.text="You have been added to the mailing list, $name"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true





    }


    }

