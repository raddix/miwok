package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> listOfWords = new ArrayList<>();
        listOfWords.add(new Word("father","әpә"));
        listOfWords.add(new Word("mother","әṭa"));
        listOfWords.add(new Word("son","angsi"));
        listOfWords.add(new Word("daughter","tune"));
        listOfWords.add(new Word("older brother","taachi"));
        listOfWords.add(new Word("younger brother","chalitti"));
        listOfWords.add(new Word("older sister","teṭe"));
        listOfWords.add(new Word("younger sister", "kolliti"));
        listOfWords.add(new Word("grandmother","ama"));
        listOfWords.add(new Word("grandfather","paapa"));


        WordAdapter adapter = new WordAdapter(this,listOfWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
