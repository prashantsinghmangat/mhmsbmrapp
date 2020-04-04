package com.example.mhmsbmrapp.AddPatientFolder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mhmsbmrapp.DashboardBmr.Out_Patient_Dashboard.activity.Out_Patientbmr;
import com.example.mhmsbmrapp.R;

public class AddPatients extends AppCompatActivity {
    Button button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_patient);


        button9=(Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AddPatients.this, Out_Patientbmr.class);
                startActivity(intent);
            }
        });


    }
}
