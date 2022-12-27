package com.template.listviewsample

import android.annotation.SuppressLint
import android.app.ListActivity
import android.os.Bundle
import android.widget.*
import com.template.listviewsample.R.array.stations
import com.template.listviewsample.R.layout.list_item

class MainActivity : ListActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val stationsArray = resources.getStringArray(stations)
        val aa = ArrayAdapter(this, list_item, stationsArray)
//        listAdapter = aa
//        val lv = listView
//        lv.adapter = aa   //вместо 3ех строк можно написать - снизу
        listView.adapter = aa
    }
}