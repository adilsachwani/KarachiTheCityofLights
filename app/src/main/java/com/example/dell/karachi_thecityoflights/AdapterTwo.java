package com.example.dell.karachi_thecityoflights;
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

public class AdapterTwo extends ArrayAdapter<Musican>{

    public AdapterTwo(Activity context, ArrayList<Musican> musicans) {
        super(context,0, musicans);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout_2,parent,false);
        }

        Musican currentMusican = getItem(position);

        TextView nameText = (TextView) listItemView.findViewById(R.id.musicans_name);
        TextView cityText = (TextView) listItemView.findViewById(R.id.musicans_song);
        ImageView image = (ImageView) listItemView.findViewById(R.id.musicans_image);

        nameText.setText(currentMusican.getMusicanName());
        cityText.setText(currentMusican.getMusicanSong());
        image.setImageResource(currentMusican.getMusicanImage());

        return listItemView;
    }
}
