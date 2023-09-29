package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onRadioButtonClicked (view: View){
        val image : ImageView = findViewById(R.id.imageView)
        val rb1 : RadioButton = findViewById(R.id.radioButton)
        val rb2 : RadioButton = findViewById(R.id.radioButton2)
        val rb3 : RadioButton = findViewById(R.id.radioButton3)

        rb1.setOnClickListener{
            image.setImageResource(R.drawable.berry)
            rb2.isChecked = false
            rb3.isChecked = false}
        rb2.setOnClickListener{
            image.setImageResource(R.drawable.blueberry)
            rb1.isChecked = false
            rb3.isChecked = false
        }
        rb3.setOnClickListener{
            image.setImageResource(R.drawable.redberry)
            rb1.isChecked = false
            rb2.isChecked = false
        }

    }
    fun checkboxclick (view: View){
        val imageBerry : ImageView = findViewById(R.id.imageView2)
        val imageBlueBerry : ImageView = findViewById(R.id.imageView3)
        val imageRedBerry : ImageView = findViewById(R.id.imageView4)

        val cb1 : CheckBox = findViewById(R.id.checkBox)
        val cb2 : CheckBox = findViewById(R.id.checkBox2)
        val cb3 : CheckBox = findViewById(R.id.checkBox3)

        if (cb1.isChecked){
            imageBerry.visibility = VISIBLE
        }
        else {
            imageBerry.visibility = INVISIBLE
        }

        if (cb2.isChecked){
            imageBlueBerry.visibility = VISIBLE
        }
        else {
            imageBlueBerry.visibility = INVISIBLE
        }

        if (cb3.isChecked){
            imageRedBerry.visibility = VISIBLE
        }
        else {
            imageRedBerry.visibility = INVISIBLE
        }

    }
}