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

public class AdapterOne extends ArrayAdapter<Place>{

    public AdapterOne(Activity context, ArrayList<Place> places) {
        super(context,0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout_1,parent,false);
        }

        Place currentPlace = getItem(position);

        TextView nameText = (TextView) listItemView.findViewById(R.id.places_name);
        TextView yearText = (TextView) listItemView.findViewById(R.id.places_year);
        ImageView image = (ImageView) listItemView.findViewById(R.id.places_image);

        nameText.setText(currentPlace.getPlaceName());
        yearText.setText(currentPlace.getPlaceYear());
        image.setImageResource(currentPlace.getPlaceImage());


        return listItemView;
    }
}
