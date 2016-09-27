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
public class HotelFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.hotel1_location),
                getString(R.string.hotel1_name),
                getString(R.string.hotel1_openTime),
                R.drawable.bighose));
        locations.add(new Location(getString(R.string.hotel2_location),
                getString(R.string.hotel2_name),
                getString(R.string.hotel2_openTime),
                R.drawable.bigroom));
        locations.add(new Location(getString(R.string.hotel3_location),
                getString(R.string.hotel3_name),
                getString(R.string.hotel3_openTime),
                R.drawable.hotel));
        locations.add(new Location(getString(R.string.hotel4_location),
                getString(R.string.hotel4_name),
                getString(R.string.hotel4_openTime),
                R.drawable.room));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);
        ListView listView = (ListView)rootView.findViewById(R.id.location_listView);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
