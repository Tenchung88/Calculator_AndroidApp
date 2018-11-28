package com.example.tenzinchozom.assign1_part2gradescalc

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import kotlinx.android.synthetic.main.results_layout.*

class ResultsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_layout)

        var passinggrad1 = intent.getStringExtra("grad1")
        var passinggrad2 = intent.getStringExtra("grad2")
        var passinggrad3 = intent.getStringExtra("grad3")
        var passinggrad4 = intent.getStringExtra("grad4")
        var passingdynamicstring = intent.getStringExtra("dynamicstring")
        var passingstring = intent.getStringExtra("stringtext")


        resgrad1_id.setText(passinggrad1)
        resgrad2_id.setText(passinggrad2)
        resgrad3_id.setText(passinggrad3)
        resgrad4_id.setText(passinggrad4)
        score_id.setText(passingdynamicstring)
        find_id.setText(passingstring)

    }

}