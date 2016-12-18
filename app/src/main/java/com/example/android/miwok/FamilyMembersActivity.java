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
        listOfWords.add(new Word("father","әpә",R.drawable.family_father));
        listOfWords.add(new Word("mother","әṭa",R.drawable.family_mother));
        listOfWords.add(new Word("son","angsi",R.drawable.family_son));
        listOfWords.add(new Word("daughter","tune",R.drawable.family_daughter));
        listOfWords.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        listOfWords.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        listOfWords.add(new Word("older sister","teṭe",R.drawable.family_older_sister));
        listOfWords.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister));
        listOfWords.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        listOfWords.add(new Word("grandfather","paapa",R.drawable.family_grandfather));


        WordAdapter adapter = new WordAdapter(this,listOfWords,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
