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

public class OpDashboard extends Fragment{
    public OpDashboard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.activity_summary_fragment,container,false);
        final ArrayList<Oplist> summary= new ArrayList<>();

        Oplist s1= new Oplist("Stocks");
        Oplist s2= new Oplist("MutualFunds");
        Oplist s3= new Oplist("Ulip");
        Oplist s4= new Oplist("Bullion");
        Oplist s5= new Oplist("Loans");
        Oplist s6= new Oplist("Property");
        Oplist s7= new Oplist("Assets");
        Oplist s8= new Oplist("Stocks");
        Oplist s9= new Oplist("MutualFunds");
        Oplist s10= new Oplist("Ulip");
        Oplist s11= new Oplist("Bullion");
        Oplist s12= new Oplist("Loans");
        Oplist s13= new Oplist("Property");
        Oplist s14= new Oplist("Assets");

        summary.add(s1);
        summary.add(s2);
        summary.add(s3);
        summary.add(s4);
        summary.add(s5);
        summary.add(s6);
        summary.add(s7);
        summary.add(s8);
        summary.add(s9);
        summary.add(s10);
        summary.add(s11);
        summary.add(s12);
        summary.add(s13);
        summary.add(s14);

        BindDictionary<Oplist> dictionary= new BindDictionary<>();
        dictionary.addStringField(R.id.textname, new StringExtractor<Oplist>() {
            @Override
            public String getStringValue(Oplist summary1, int position) {
                return summary1.getName();
            }
        });

        FunDapter dapter= new FunDapter(OpDashboard.this.getActivity(),summary,R.layout.summry_layout,dictionary);
        ListView listview= (ListView)view.findViewById(R.id.summarylistview);

        listview.setAdapter(dapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Oplist selecteditem = summary.get(position);
                Toast.makeText(OpDashboard.this.getActivity(),selecteditem.getName(),Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }

}
