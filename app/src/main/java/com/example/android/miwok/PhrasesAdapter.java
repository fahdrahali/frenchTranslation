package com.example.android.miwok;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesAdapter extends ArrayAdapter<Color> {


    public PhrasesAdapter(Activity context, ArrayList<Color> colors){
            super(context,0,colors);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView ;
        if(listViewItem == null){
            listViewItem = LayoutInflater.from(
                    getContext()).inflate(R.layout.list_item,parent,false);
        }

        Color currentView = getItem(position);

        TextView defaultTextView = (TextView) listViewItem.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentView.getmDefaultTranslation());

        TextView frenchTextView = (TextView) listViewItem.findViewById(R.id.french_text_view);
        frenchTextView.setText(currentView.getmFrenchTranslation());

        ImageView imageView = listViewItem.findViewById(R.id.imageView);
        imageView.setImageResource(currentView.getmImageRessourceId());

        return listViewItem;
    }
}
