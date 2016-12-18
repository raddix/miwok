package com.example.android.miwok;

import android.content.Context;
import android.provider.UserDictionary;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abc1 on 11/5/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int colorCode;
    public WordAdapter(Context context, ArrayList<Word> listOfWords, int colorCode) {
        super(context, 0, listOfWords);
        this.colorCode = colorCode;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

            Word currentWordItem = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwokTextView);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            nameTextView.setText(currentWordItem.getmMiwokTranslation());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView numberTextView = (TextView) listItemView.findViewById(R.id.englishTextView);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            numberTextView.setText(currentWordItem.getmEnglishWord());

            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);

            View textContainerView = listItemView.findViewById(R.id.textContainerLinearLayout);
            int color = ContextCompat.getColor(getContext(),colorCode);
            textContainerView.setBackgroundColor(color);

            if(currentWordItem.getmImageResourceId()==0)
            {
                imageView.setVisibility(View.GONE);
            }
            else
            {
                imageView.setImageResource(currentWordItem.getmImageResourceId());
            }



            return listItemView;

    }
}
