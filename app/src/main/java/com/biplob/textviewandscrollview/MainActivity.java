package com.biplob.textviewandscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameTV,addTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTV=findViewById(R.id.name);
        addTV=findViewById(R.id.add);

        nameTV.setText("Daffodil Internatonal University");
        addTV.setText("Asuliya,Dhaka");




    }
}