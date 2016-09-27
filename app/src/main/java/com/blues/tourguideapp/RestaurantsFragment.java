package com.blues.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.restaurant1_position),
                getString(R.string.restaurant1_name),
                getString(R.string.restaurant1_openTime),
                R.drawable.food1));
        locations.add(new Location(getString(R.string.restaurant2_position),
                getString(R.string.restaurant2_name),
                getString(R.string.restaurant2_openTime),
                R.drawable.food2));
        locations.add(new Location(getString(R.string.restaurant3_position),
                getString(R.string.restaurant3_name),
                getString(R.string.restaurant3_openTime),
                R.drawable.cake));
        locations.add(new Location(getString(R.string.restaurant4_position),
                getString(R.string.restaurant4_name),
                getString(R.string.restaurant4_openTime),
                R.drawable.cake2));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);
        ListView listView = (ListView)rootView.findViewById(R.id.location_listView);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
