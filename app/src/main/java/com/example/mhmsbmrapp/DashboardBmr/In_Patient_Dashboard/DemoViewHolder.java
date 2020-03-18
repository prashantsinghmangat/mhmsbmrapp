package com.example.mhmsbmrapp.DashboardBmr.In_Patient_Dashboard;


import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mhmsbmrapp.R;

public abstract class DemoViewHolder extends RecyclerView.ViewHolder {


    public TextView title;


    public DemoViewHolder(View view) {
        super(view);


        this.title = (TextView) view.findViewById(R.id.cardTitle);

    }


}