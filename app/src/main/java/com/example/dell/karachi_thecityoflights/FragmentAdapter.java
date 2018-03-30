package com.example.dell.karachi_thecityoflights;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public FragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new PlacesFragment();
        else if(position==1)
            return new RestrauntsFragment();
        else
            return new MusicansFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
            return mContext.getString(R.string.tabs_places);
        else if(position==1)
            return mContext.getString(R.string.tabs_restraunts);
        else
            return mContext.getString(R.string.tabs_musicians);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
