package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> listOfWords = new ArrayList<>();
        listOfWords.add(new Word("red","weṭeṭṭi"));
        listOfWords.add(new Word("green","chokokki"));
        listOfWords.add(new Word("brown","ṭakaakki"));
        listOfWords.add(new Word("gray","ṭopoppi"));
        listOfWords.add(new Word("black","kululli"));
        listOfWords.add(new Word("white","kelelli"));
        listOfWords.add(new Word("dusty yellow","ṭopiisә"));
        listOfWords.add(new Word("mustard yellow", "chiwiiṭә"));

        WordAdapter adapter = new WordAdapter(this,listOfWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
