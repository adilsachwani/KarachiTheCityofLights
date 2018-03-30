package com.example.dell.karachi_thecityoflights;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {


    private ArrayList<Place> Places;
    private ListView mListView;
    private AdapterOne mPlaceAdapter;

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_layout,container,false);
        mListView = (ListView) rootView.findViewById(R.id.list);
        Places = new ArrayList<Place>();

        Places.add(new Place("Mazar-e-Quaid","1970",R.drawable.places_mazhar_e_quaid));
        Places.add(new Place("Masjid-e-Tooba","1969",R.drawable.places_masjid_e_tooba));
        Places.add(new Place("PAF Museum","1990",R.drawable.places_paf_museum));
        Places.add(new Place("Port Grand","2011",R.drawable.places_port_grand));
        Places.add(new Place("Place Zoo","1878",R.drawable.places_karachi_zoo));
        Places.add(new Place("Empress Market","1884",R.drawable.places_empress_market));
        Places.add(new Place("Churna Island","Forever",R.drawable.places_churna_island));
        Places.add(new Place("PIA Planetairum","1985",R.drawable.places_pia_planetarium));
        Places.add(new Place("Clifton Beach","Forever",R.drawable.places_clifton_beach));
        Places.add(new Place("Maritime Museum","1954",R.drawable.places_maritime_museum));

        mPlaceAdapter = new AdapterOne(getActivity(),Places);
        mListView.setAdapter(mPlaceAdapter);

        return rootView;
    }

}