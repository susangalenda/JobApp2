package com.example.antony.jobapp;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

public class Jobseeker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobseeker);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

    }
}
