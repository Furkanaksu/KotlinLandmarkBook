package com.furkan.kotlinlandmarkbook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var landmarkNames = ArrayList<String>()
        landmarkNames.add("Pisa")
        landmarkNames.add("Colosseum")
        landmarkNames.add("Eiffel")
        landmarkNames.add("London Bridge")

        val pisa = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
        val colosseum = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.collesium)
        val eifefel = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eifell)
        val londonBridge = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.towerbridge)

        val landmarkImages = ArrayList<Bitmap>()

        landmarkImages.add(pisa)
        landmarkImages.add(colosseum)
        landmarkImages.add(eifefel)
        landmarkImages.add(londonBridge)

        
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)

        listView.adapter = arrayAdapter
    }
}
