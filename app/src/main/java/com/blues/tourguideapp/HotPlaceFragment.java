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
public class HotPlaceFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.hotPlace1_position),
                getString(R.string.hotPlace1_name),
                getString(R.string.hotPlace1_openTime),
                R.drawable.spa));
        locations.add(new Location(getString(R.string.hotPlace2_position),
                getString(R.string.hotPlace2_name),
                getString(R.string.hotPlace2_openTime),
                R.drawable.spring));
        locations.add(new Location(getString(R.string.hotPlace3_position),
                getString(R.string.hotPlace3_name),
                getString(R.string.hotPlace3_openTime),
                R.drawable.swimingpool));
        locations.add(new Location(getString(R.string.hotPlace4_position),
                getString(R.string.hotPlace4_name),
                getString(R.string.hotPlace4_openTime),
                R.drawable.spaa));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);
        ListView listView = (ListView)rootView.findViewById(R.id.location_listView);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
