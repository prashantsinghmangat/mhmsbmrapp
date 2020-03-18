package com.example.mhmsbmrapp.DashboardBmr.Out_Patient_Dashboard.activity.OpAssessement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mhmsbmrapp.R;

public class AssessementHistory extends Fragment {
    private static final String TAG = "Fragment2";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.opassessemethistory, container, false);

        return view;
    }
}

