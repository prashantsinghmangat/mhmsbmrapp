package com.example.mhmsbmrapp.DashboardBmr.Mutal.activity.TabViewPatientDetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mhmsbmrapp.R;

public class FragmentOpHistory extends Fragment {
    private static final String TAG = "Fragment1";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment3_layout, container, false);

        return view;
    }
}

