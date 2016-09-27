package com.blues.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopingFragment extends Fragment {
    public ShopingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.shoping1_location),
                getString(R.string.shoping1_name),
                getString(R.string.shoping1_openTime),
                R.drawable.shop1));
        locations.add(new Location(getString(R.string.shoping2_location),
                getString(R.string.shoping2_name),
                getString(R.string.shoping2_openTime),
                R.drawable.shop2));
        locations.add(new Location(getString(R.string.shoping3_location),
                getString(R.string.shoping3_name),
                getString(R.string.shoping3_openTime),
                R.drawable.shop3));
        locations.add(new Location(getString(R.string.shoping4_location),
                getString(R.string.shoping4_name),
                getString(R.string.shoping4_openTime),
                R.drawable.shop4));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);
        ListView listView = (ListView)rootView.findViewById(R.id.location_listView);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
