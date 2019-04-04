package com.example.antony.jobapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Button button;

//    NAME: GALENDA SUZAN CARO
//    REGNO:   2017/BIT/166
//    COURSE:  MOBILE APPLICATION PROGRAMMING
private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

btn = (Button) findViewById(R.id.button);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intt = new Intent(MainActivity.this,Employer.class);
        startActivity(intt);
    }
});

    }
    public void next(View view){
        Intent ioo = new Intent(this,Employer.class);
        startActivity(ioo);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"the app is started",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
