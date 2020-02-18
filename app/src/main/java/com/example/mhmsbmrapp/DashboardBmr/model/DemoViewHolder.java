package com.example.mhmsbmrapp.DashboardBmr.model;


import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mhmsbmrapp.R;

/**
 * Created by SONU on 31/08/15.
 */
public abstract class DemoViewHolder extends RecyclerView.ViewHolder {


    public TextView title;


    public DemoViewHolder(View view) {
        super(view);


        this.title = (TextView) view.findViewById(R.id.cardTitle);

    }


}