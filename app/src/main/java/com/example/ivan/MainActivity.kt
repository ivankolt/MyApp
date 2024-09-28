package com.example.ivan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Answer: TextView = findViewById(R.id.Answer)
        val Pole: EditText = findViewById(R.id.editTextTextPersonName)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener()
        {

            val TEXT = Pole.text.toString().trim()

            if(TEXT.toIntOrNull() == null)
            {

                Answer.text = "Нельзя"
            }
            else {

                val Item: Int = TEXT.toInt()

                if(Item>=-4 && Item <=-1)
                {
                  Answer.text = (Item+2).toString()
                }
                else if (Item>-1 && Item<=0)
                {
                    Answer.text = (Item*Item).toString()

                }
                else if (Item >0 && Item <=4)
                {

                    Answer.text = "4"
                }
                else
                {

                    Answer.text = "0"
                }
            }

        }

    }
}