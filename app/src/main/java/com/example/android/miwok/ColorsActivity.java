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
        listOfWords.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        listOfWords.add(new Word("green","chokokki",R.drawable.color_green));
        listOfWords.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        listOfWords.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        listOfWords.add(new Word("black","kululli",R.drawable.color_black));
        listOfWords.add(new Word("white","kelelli",R.drawable.color_white));
        listOfWords.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        listOfWords.add(new Word("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this,listOfWords,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
