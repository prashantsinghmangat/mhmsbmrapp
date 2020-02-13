package com.example.mhmsbmrapp.DashboardBmr;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static com.example.mhmsbmrapp.DashboardBmr.TabFragment.int_items;

public class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OpDashboard();
            case 1:
                return new IpDashboard();
            case 2:
                return new MutalFundsFragment();


        }
        return null;
    }

    @Override
    public int getCount() {


        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Out-Patient";
            case 1:
                return "In-Patient";
            case 2:
                return "Mutual";


        }

        return null;
    }
}
