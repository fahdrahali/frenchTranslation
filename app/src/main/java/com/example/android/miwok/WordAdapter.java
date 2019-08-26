package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorRessourceId;


    public WordAdapter(Activity context, ArrayList<Word> words, int colorRessourceId) {
        super(context, 0,words);
        mColorRessourceId = colorRessourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }


        Word currentWord = getItem(position);

        TextView defaultText = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultText.setText(currentWord.getmDefaultTranslation());


        TextView miwokText = (TextView) listItemView.findViewById(R.id.french_text_view);
        miwokText.setText(currentWord.getmMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);

        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImageRessourceId());
            imageView.setVisibility(View.VISIBLE);

        }else {
            imageView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mColorRessourceId);

        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
