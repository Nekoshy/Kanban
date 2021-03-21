package com.example.kanban

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val poleTekstowe1: EditText;
        val arrayAdapter: ArrayAdapter<*>
        val zadania1: MutableList<String> = ArrayList()

        val mListView1 = findViewById<ListView>(R.id.listview1)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, zadania1)
        mListView1.adapter = arrayAdapter
        poleTekstowe1 = findViewById(R.id.editText1)

        val btnToDo = findViewById(R.id.btDoZrobienia) as Button
        btnToDo.setOnClickListener {
            zadania1.add(poleTekstowe1.text.toString())
            mListView1.adapter = arrayAdapter
        }

        val poleTekstowe2: EditText;
        val arrayAdapter2: ArrayAdapter<*>
        val zadania2: MutableList<String> = ArrayList()

        val mListView2 = findViewById<ListView>(R.id.listview2)

        arrayAdapter2 = ArrayAdapter(this, android.R.layout.simple_list_item_1, zadania2)
        mListView2.adapter = arrayAdapter2
        poleTekstowe2 = findViewById(R.id.editText2)

        val btnDo = findViewById(R.id.btwTrakcie) as Button
        btnDo.setOnClickListener {
            zadania2.add(poleTekstowe2.text.toString())
            mListView2.adapter = arrayAdapter2
        }

        val poleTekstowe3: EditText;
        val arrayAdapter3: ArrayAdapter<*>
        val zadania3: MutableList<String> = ArrayList()

        val mListView3 = findViewById<ListView>(R.id.listview3)

        arrayAdapter3 = ArrayAdapter(this, android.R.layout.simple_list_item_1, zadania3)
        mListView3.adapter = arrayAdapter3
        poleTekstowe3 = findViewById(R.id.editText3)

        val btnDone = findViewById(R.id.btZrobione) as Button
        btnDone.setOnClickListener {
            zadania3.add(poleTekstowe3.text.toString())
            mListView3.adapter = arrayAdapter3
        }


    }
}