package com.example.dell.karachi_thecityoflights;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestrauntsFragment extends Fragment {

    private ArrayList<Place> Restraunts;
    private AdapterOne mRestrauntAdapter;
    private ListView mListView;

    public RestrauntsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_layout,container,false);
        Restraunts = new ArrayList<Place>();
        mListView = (ListView) rootView.findViewById(R.id.list);

        Restraunts.add((new Place("BBQ Tonight","",R.drawable.restraunts_bbq_tonight)));
        Restraunts.add((new Place("Burger Lab","",R.drawable.restraunts_burger_lab)));
        Restraunts.add((new Place("Javed Nihari","",R.drawable.restraunts_javed_nihari)));
        Restraunts.add((new Place("Kolachi Restraunt","",R.drawable.restraunts_kolachi_restraunt)));
        Restraunts.add((new Place("Arizona Grill","",R.drawable.restraunts_arizona_grill)));
        Restraunts.add((new Place("Waheed Kabab House","",R.drawable.restraunts_waheed_kabab_house)));
        Restraunts.add((new Place("Al-Habib Restraunt","",R.drawable.restraunts_al_habib_restraunt)));
        Restraunts.add((new Place("Kabab Ji","",R.drawable.restraunts_kabab_ji)));
        Restraunts.add((new Place("Shams Chaat House","",R.drawable.restraunts_shams_chaat_house)));
        Restraunts.add((new Place("Student Biryani","",R.drawable.restraunts_student_biryani)));

        mRestrauntAdapter = new AdapterOne(getActivity(),Restraunts);
        mListView.setAdapter(mRestrauntAdapter);

        return rootView;
    }

}
