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


        ArrayList<Word> listOfWords = new ArrayList<>();
        listOfWords.add(new Word("one","lutti"));
        listOfWords.add(new Word("two","otiiko"));
        listOfWords.add(new Word("three","tolookosu"));
        listOfWords.add(new Word("four","oyyisa"));
        listOfWords.add(new Word("five","masooka"));
        listOfWords.add(new Word("six","temmokka"));
        listOfWords.add(new Word("seven","kenekoku"));
        listOfWords.add(new Word("eight", "kavinta"));
        listOfWords.add(new Word("nine","wo'e"));
        listOfWords.add(new Word("ten","ne'achaa"));


        WordAdapter adapter = new WordAdapter(this,listOfWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }


}
