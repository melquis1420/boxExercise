package com.example.boxexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxColor.setOnClickListener(){
            if(boxColor.isChecked){
                imageColor.setColorFilter(resources.getColor(R.color.colorAccent))

            } else
                imageColor.setColorFilter(resources.getColor(R.color.black))
        }
    }
}
