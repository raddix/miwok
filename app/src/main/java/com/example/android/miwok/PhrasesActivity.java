package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> listOfWords = new ArrayList<>();
        listOfWords.add(new Word("Where are you going?","minto wuksus"));
        listOfWords.add(new Word("What is your name?","tinnә oyaase'nә"));
        listOfWords.add(new Word("My name is Rohit","oyaaset Rohit"));
        listOfWords.add(new Word("How are you feeling?","michәksәs?"));
        listOfWords.add(new Word("I’m feeling good.","kuchi achit"));
        listOfWords.add(new Word("Are you coming?","әәnәs'aa?"));
        listOfWords.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        listOfWords.add(new Word("I’m coming.", "әәnәm"));
        listOfWords.add(new Word("Let’s go.","yoowutis"));
        listOfWords.add(new Word("Come here.","әnni'nem"));


        WordAdapter adapter = new WordAdapter(this,listOfWords,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
