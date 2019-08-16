package com.devign.paperscissorsrock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView



class MainActivity : AppCompatActivity() {

    val optionsList = arrayListOf("Paper", "Scissors", "Rock")
    val images = arrayListOf(R.drawable.paper_icon, R.drawable.scissors_icon, R.drawable.rock_icon)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // When clicking 'Paper, Scissors, Rock' Button...
        randomizeBtn.setOnClickListener{
            // ready random generator
            val random = java.util.Random()
            // create a new integer at random within the count of the optionsList array
            val newAndRandomOption = random.nextInt(optionsList.count())
            // change the selectedOptions text in conjunction with the randomly outputted option from the optionsList
            selectedOption.text = optionsList[newAndRandomOption]
            // Change image on text change
            selectedOptionsImg.setImageResource(images[newAndRandomOption])
        }

        //  When clicking the 'Add Option' button...
//        addOptionBtn.setOnClickListener{
//            // create a new string
//            val newOption = addOptionInput.text.toString()
//            // add this new string to the optionsList
//            optionsList.add(newOption)
//            // clear the input for next use
//            addOptionInput.text.clear()
//        }
    }
}
