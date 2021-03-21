package com.example.kanban

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>
        val zadania1: MutableList<String> = ArrayList()

        val mListView1 = findViewById<ListView>(R.id.listview1)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, zadania1)
        mListView1.adapter = arrayAdapter

        val btnToDo = findViewById(R.id.btDoZrobienia) as Button
        btnToDo.setOnClickListener {
            zadania1.add("Zadanie")
            mListView1.adapter = arrayAdapter
        }


    }
}