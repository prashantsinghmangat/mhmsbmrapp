package com.example.mhmsbmrapp.DashboardBmr.Mutal.activity.TabViewPatientDetails;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static com.example.mhmsbmrapp.DashboardBmr.Mutal.activity.TabViewPatientDetails.Fragment1.int_items;

public class MyNewAdapter extends FragmentPagerAdapter {

    int tabCount;


    //Constructor to the class
    public MyNewAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount = tabCount;
    }

    public MyNewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentOp();
            case 1:
                return new FragmentOpHistory();

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
                return "FragmentOP";
            case 1:
                return "FragmenOphistory";


        }

        return null;
    }
}
