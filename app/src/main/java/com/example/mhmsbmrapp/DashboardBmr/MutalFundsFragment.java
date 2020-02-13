package com.example.mhmsbmrapp.DashboardBmr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mhmsbmrapp.R;

public class MutalFundsFragment extends Fragment{

    Button click;
    public static TextView data;

    public MutalFundsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_mutal_funds_fragment, container,    false);

        click = (Button) v.findViewById(R.id.button);
        data = (TextView) v.findViewById(R.id.fetcheddata);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData process = new fetchData();
                process.execute();
            }
        });
        return v;
    }

}
