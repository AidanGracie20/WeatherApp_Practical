package com.example.weatherapp_practical

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var buttonMo = findViewById<Button>(R.id.buttonMo)
        buttonMo.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        var buttonTu = findViewById<Button>(R.id.buttonTu)
        buttonTu.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        var buttonWe = findViewById<Button>(R.id.buttonWe)
        buttonWe.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        var buttonTh = findViewById<Button>(R.id.buttonTh)
        buttonTh.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

        var buttonFr = findViewById<Button>(R.id.buttonFr)
        buttonFr.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }

        var buttonSa = findViewById<Button>(R.id.buttonSa)
        buttonSa.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

        var buttonSu = findViewById<Button>(R.id.buttonSu)
        buttonSu.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        var buttonBack10 = findViewById<Button>(R.id.buttonBack10)
        buttonBack10.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)





            var buttonCal = findViewById<Button>(R.id.buttonCal)
            buttonCal.setOnClickListener {
                var TextView69 = findViewById<TextView>(R.id.TextView69)
                TextView69.text = "23.9"

                var numbers = arrayOf(26, 27, 21, 32, 26, 12, 23)
                var TempArrayMin = arrayOf(13, 12, 10, 19, 13, 6, 13)
                var size = 7

                var sum = 167
                for (num in numbers) {
                    sum += num
                }
                val average = sum / numbers.size

               ("the average is:$average")

                var Clearbutton = findViewById<Button>(R.id.Clearbutton)
                Clearbutton.setOnClickListener { TextView69.text }





            }
        }
    }
}









