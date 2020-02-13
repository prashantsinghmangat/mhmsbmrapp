package com.example.mhmsbmrapp.DashboardBmr;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import com.ami.fundapter.BindDictionary;
import com.ami.fundapter.FunDapter;
import com.ami.fundapter.extractors.StringExtractor;
import com.example.mhmsbmrapp.R;

import java.util.ArrayList;

public class IpDashboard extends Fragment{
    public IpDashboard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.activity_stock_fragment,container,false);
        final ArrayList<Iplist> stocks = new ArrayList<>();

        Iplist s1= new Iplist("Aban Offshore");
        Iplist s2= new Iplist("Assoc alcohol");
        Iplist s3= new Iplist("AxisBank");
        Iplist s4= new Iplist("NBCC");
        Iplist s5= new Iplist("Sbi");
        Iplist s6= new Iplist("YesBank");
        Iplist s7= new Iplist("TCS");
        Iplist s8= new Iplist("Aban Offshore");
        Iplist s9= new Iplist("Assoc alcohol");
        Iplist s10= new Iplist("AxisBank");
        Iplist s11= new Iplist("NBCC");
        Iplist s12= new Iplist("Sbi");
        Iplist s13= new Iplist("YesBank");
        Iplist s14= new Iplist("TCS");

        stocks.add(s1);
        stocks.add(s2);
        stocks.add(s3);
        stocks.add(s4);
        stocks.add(s5);
        stocks.add(s6);
        stocks.add(s7);
        stocks.add(s8);
        stocks.add(s9);
        stocks.add(s10);
        stocks.add(s11);
        stocks.add(s12);
        stocks.add(s13);
        stocks.add(s14);


        BindDictionary<Iplist> dictionary= new BindDictionary<>();
        dictionary.addStringField(R.id.textname, new StringExtractor<Iplist>() {
            @Override
            public String getStringValue(Iplist stock1, int position) {
                return stock1.getName();
            }
        });

        FunDapter dapter= new FunDapter(IpDashboard.this.getActivity(),stocks,R.layout.stock_layout,dictionary);
        ListView listview= (ListView)view.findViewById(R.id.stocklistview);

        listview.setAdapter(dapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Iplist selecteditem = stocks.get(position);
                Toast.makeText(IpDashboard.this.getActivity(),selecteditem.getName(),Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }
}
