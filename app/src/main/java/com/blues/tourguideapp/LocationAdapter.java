package com.blues.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by blues on 2016/9/26.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0 ,locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_tv);
        nameTextView.setText("Name: " + currentLocation.getName());

        TextView positionTextView= (TextView) listItemView.findViewById(R.id.position_tv);
        positionTextView.setText("Address: " + currentLocation.getAddress());

        TextView openTimeTextView = (TextView) listItemView.findViewById(R.id.openTime_tv);
        openTimeTextView.setText("Open-Time: " + currentLocation.getOpentime());

        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.place_imageView);
        if (!currentLocation.hasImage()){
            placeImageView.setVisibility(View.GONE);
            listItemView.getLayoutParams().height = FrameLayout.LayoutParams.WRAP_CONTENT;
        } else {
            placeImageView.setImageResource(currentLocation.getImageResourceId());
        }

        return listItemView;
    }
}
