package com.example.inputandoutput

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//Get button using ID
  val clickMeButton =  findViewById<Button>(R.id.clickButton)
        val welcomeText = findViewById<TextView>(R.id.displayText)
        val nameTxtField = findViewById<EditText>(R.id.nameText)
// add code to button
clickMeButton?.setOnClickListener {
    Toast.makeText(this@MainActivity,"Button clicked",
        Toast.LENGTH_LONG).show()
    welcomeText.text = "Welcome ${nameTxtField.text}"
    //welcomeTxt.text = "Welcome" * nameTxtField.text
}
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}