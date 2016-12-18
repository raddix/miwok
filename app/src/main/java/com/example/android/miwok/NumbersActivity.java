package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> listOfWords = new ArrayList<>();
        listOfWords.add(new Word("one","lutti",R.drawable.number_one));
        listOfWords.add(new Word("two","otiiko",R.drawable.number_two));
        listOfWords.add(new Word("three","tolookosu",R.drawable.number_three));
        listOfWords.add(new Word("four","oyyisa",R.drawable.number_four));
        listOfWords.add(new Word("five","masooka",R.drawable.number_five));
        listOfWords.add(new Word("six","temmokka",R.drawable.number_six));
        listOfWords.add(new Word("seven","kenekoku",R.drawable.number_seven));
        listOfWords.add(new Word("eight", "kavinta",R.drawable.number_eight));
        listOfWords.add(new Word("nine","wo'e",R.drawable.number_nine));
        listOfWords.add(new Word("ten","ne'achaa",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this,listOfWords,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
                mMediaPlayer.start();
            }
        });

    }


}
