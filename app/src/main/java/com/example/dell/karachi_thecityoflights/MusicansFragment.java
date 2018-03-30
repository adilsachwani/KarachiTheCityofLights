package com.example.dell.karachi_thecityoflights;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicansFragment extends Fragment {


    private ArrayList<Musican> Musicans;
    private ListView mListView;
    private AdapterTwo mMusicanAdapter;
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompleteListner = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    public MusicansFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_layout,container,false);
        mListView = (ListView) rootView.findViewById(R.id.list);
        Musicans = new ArrayList<Musican>();

        Musicans.add(new Musican("Shafqat Amanat Ali","Mitwa",R.drawable.musicians_shafqat_amanat_ali,R.raw.mitwa));
        Musicans.add(new Musican("Jal Band","Lamhay",R.drawable.musicians_jal,R.raw.lamhay));
        Musicans.add(new Musican("Sajjad Ali","Har Zulm",R.drawable.musicians_sajjad_ali,R.raw.har_zulm));
        Musicans.add(new Musican("Abida Parveen","Aaqa",R.drawable.musicians_abida_parveen,R.raw.aaqa));
        Musicans.add(new Musican("Rahat Fateh Ali Khan","Zaroori Tha",R.drawable.musicians_rahat_fateh_ali_khan,R.raw.zaroori_tha));
        Musicans.add(new Musican("Qurtulain Balouch","Humsafar",R.drawable.musicians_qurtulain_balouch,R.raw.humsafar));
        Musicans.add(new Musican("Strings","Sajni",R.drawable.musicians_strings,R.raw.sajni));
        Musicans.add(new Musican("Atif Aslam","Pehli Nazar Mein",R.drawable.musicians_atif_aslam,R.raw.pehli_nazar_mein));
        Musicans.add(new Musican("Ali Zafar","Sajaniya",R.drawable.musicians_ali_zafar,R.raw.sajaniya));
        Musicans.add(new Musican("Call Band","Ho Jaane De",R.drawable.musicians_call,R.raw.ho_jaane_de));

        mMusicanAdapter = new AdapterTwo(getActivity(),Musicans);
        mListView.setAdapter(mMusicanAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Musican musican = Musicans.get(i);

                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(getActivity(),musican.getMusicanMusic());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompleteListner);

            }
        });

        return rootView;
    }

    public void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if(this.isVisible()){
            if(!isVisibleToUser)
                releaseMediaPlayer();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

}