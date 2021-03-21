package com.example.kanban

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>
        val zadania1: MutableList<String> = ArrayList()
        zadania1.add("Zadanie1")
        zadania1.add("Zadanie2")
        zadania1.add("Zadanie3")

        val mListView1 = findViewById<ListView>(R.id.listview1)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, zadania1)
        mListView1.adapter = arrayAdapter


    }
}