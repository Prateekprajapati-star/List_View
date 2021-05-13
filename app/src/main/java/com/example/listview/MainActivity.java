package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] arr = {"C","C++","Java","Android","Kotlin","React","Rest API","Java Script","Node JS","Data Structure","Array","Stack","Queue","Tree","HashMap","Binary Search","Graphs"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,arr);
        listView.setAdapter(ad);
    }
}