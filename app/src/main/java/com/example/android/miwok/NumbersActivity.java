package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<String> listOfWords = new ArrayList<String>();
        listOfWords.add("One");
        listOfWords.add("Two");
        listOfWords.add("Three");
        listOfWords.add("Four");
        listOfWords.add("Five");
        listOfWords.add("Six");
        listOfWords.add("Seven");
        listOfWords.add("Eight");
        listOfWords.add("Nine");
        listOfWords.add("Ten");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,listOfWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }


}
