package com.example.weatherapp_practical

import android.content.Intent
import android.health.connect.datatypes.units.Temperature
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
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

        var buttonCal = findViewById<Button>(R.id.buttonCal)
        buttonCal.setOnClickListener {
            val textView1 = findViewById<TextView>(R.id.textView1)
            textView1.text = "23.9"

            var numbers = arrayOf(26, 27, 21, 32, 26, 12, 23)
            var TempArrayMin = arrayOf(13, 12, 10, 19, 13, 6, 13)

            var sum = 0.0
            for (num in numbers) {
                sum += num
            }
            val average = sum / numbers.size

            println("the average is:$average")


        }
    }
}