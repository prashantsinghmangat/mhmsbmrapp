package com.example.mhmsbmrapp.DashboardBmr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mhmsbmrapp.R;

public class Iplist {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Iplist(String name) {
        this.name = name;
    }
}
