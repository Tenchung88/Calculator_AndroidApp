package com.example.tenzinchozom.assign1_part2gradescalc

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "Grades Calc"

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"Grades Calculator created")
        var grade1 = grad1_id.text
        var grade2 = grad2_id.text
        var grade3 = grad3_id.text
        var grade4  = grad4_id.text

//       var score1 =  grade1
//        var score2
// = grade2
//        var score3 = grade3
//        var score4 = grade4


//        var myarray: IntArray = intArrayOf(grade1.toString().toInt(),grade2.toString().toInt(),grade3.toString().toInt(),grade4.toString().toInt())

//        var HighestScore =  myarray.max()
//        var LowestScore = myarray.min()
//        var Average = myarray.average()

        var nameOfColleges = arrayOf(
            "Seneca Valley College",
            "Hummingbird Academy",
            "Harrington High",
            "Georgian Bay College",
            "Saracuse Academy",
            "St-Vincent College",
            "Seneca College",
            "Seneca York",
            "Seneca North"
        )


        butavg_id.setOnClickListener{
            var myarray: IntArray = intArrayOf(grade1.toString().toInt(),grade2.toString().toInt(),grade3.toString().toInt(),grade4.toString().toInt())

            var i = Intent(this,ResultsActivity::class.java)
            i.putExtra("grad1",grade1.toString())
            i.putExtra("grad2",grade2.toString())
            i.putExtra("grad3",grade3.toString())
            i.putExtra("grad4",grade4.toString())
            var Average = myarray.average()

            i.putExtra("dynamicstring", Average.toString())
            i.putExtra("stringtext","THE AVERAGE:")

            startActivity(i)
        }

        butMin_id.setOnClickListener {
            var i = Intent(this,ResultsActivity::class.java)
            i.putExtra("grad1",grade1.toString())
            i.putExtra("grad2",grade2.toString())
            i.putExtra("grad3",grade3.toString())
            i.putExtra("grad4",grade4.toString())

            var myarray: IntArray = intArrayOf(grade1.toString().toInt(),grade2.toString().toInt(),grade3.toString().toInt(),grade4.toString().toInt())
            var LowestScore = myarray.min()
            i.putExtra("dynamicstring", LowestScore.toString())
            i.putExtra("stringtext","THE MIN:")

            startActivity(i)
        }
        butmax_id.setOnClickListener {
            var i = Intent(this,ResultsActivity::class.java)
            i.putExtra("grad1",grade1.toString())
            i.putExtra("grad2",grade2.toString())
            i.putExtra("grad3",grade3.toString())
            i.putExtra("grad4",grade4.toString())
            var myarray: IntArray = intArrayOf(grade1.toString().toInt(),grade2.toString().toInt(),grade3.toString().toInt(),grade4.toString().toInt())
            var HighestScore = myarray.max()
            i.putExtra("dynamicstring", HighestScore.toString())
            i.putExtra("stringtext","THE MAX:")

            startActivity(i)
        }

        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_dropdown_item_1line, nameOfColleges
        )
        //bind this array to autocompletetextview(i.e. widget) i.e. instantiate the autocompletetextview
        val actv = findViewById(R.id.autocomplete_id) as AutoCompleteTextView
        actv.threshold = 2
        actv.setAdapter<ArrayAdapter<String>>(adapter)
    }


override
fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.

        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override
    fun onOptionsItemSelected(item: MenuItem): Boolean {

        var grade1 = grad1_id.text
        var grade2 = grad2_id.text
        var grade3 = grad3_id.text
        var grade4  = grad4_id.text

//        val myarray:IntArray = intArrayOf(grade1.toString().toInt(),grade2.toString().toInt(),grade3.toString().toInt(),grade4.toString().toInt())
//        var HighestScore =  myarray.max()
//        var LowestScore = myarray.min()
//        var Average = myarray.average()




        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return  if (id == R.id.aboutID) {
            var i = Intent(this,About::class.java)
            startActivity(i)
            true
        } else if(id == R.id.MinId) {
            var i = Intent(this,ResultsActivity::class.java)
            i.putExtra("grad1",grade1.toString())
            i.putExtra("grad2",grade2.toString())
            i.putExtra("grad3",grade3.toString())
            i.putExtra("grad4",grade4.toString())
            var myarray: IntArray = intArrayOf(grade1.toString().toInt(),grade2.toString().toInt(),grade3.toString().toInt(),grade4.toString().toInt())
            var LowestScore = myarray.min()
            i.putExtra("dynamicstring",LowestScore.toString())
            i.putExtra("stringtext","THE MIN:")
            startActivity(i)
            true
        } else if (id == R.id.MaxId)
        {
            var i = Intent(this,ResultsActivity::class.java)
            i.putExtra("grad1",grade1.toString())
            i.putExtra("grad2",grade2.toString())
            i.putExtra("grad3",grade3.toString())
            i.putExtra("grad4",grade4.toString())
            var myarray: IntArray = intArrayOf(grade1.toString().toInt(),grade2.toString().toInt(),grade3.toString().toInt(),grade4.toString().toInt())
            var HighestScore = myarray.max()
            i.putExtra("dynamicstring",HighestScore.toString())
            i.putExtra("stringtext", "THE MAX:")
            startActivity(i)
            true
        } else if(id == R.id.AvgId){
            var i = Intent(this,ResultsActivity::class.java)
            i.putExtra("grad1",grade1.toString())
            i.putExtra("grad2",grade2.toString())
            i.putExtra("grad3",grade3.toString())
            i.putExtra("grad4",grade4.toString())
            var myarray: IntArray = intArrayOf(grade1.toString().toInt(),grade2.toString().toInt(),grade3.toString().toInt(),grade4.toString().toInt())
            var Average = myarray.average()
            i.putExtra("dynamicstring",Average.toString())
            i.putExtra("stringtext","THE AVERAGE:")
            startActivity(i)
            true
        }

        else super.onOptionsItemSelected(item)
    }



}
