package com.example.assignment002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Help extends AppCompatActivity implements View.OnClickListener{

    ImageView i1,i2,i3,i4,i5;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        i1=findViewById(R.id.bg1);
        i2 = findViewById(R.id.bg2);
        i3 = findViewById(R.id.bg3);
        i4 = findViewById(R.id.bg4);
        i5 = findViewById(R.id.bg5);
        i1.setVisibility(i1.VISIBLE);


        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.bg1){
            i1.setVisibility(v.GONE);
            i2.setVisibility(v.VISIBLE);
        }

        if(v.getId()==R.id.bg2){
            i2.setVisibility(v.GONE);
            i3.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.bg4){
            i4.setVisibility(v.GONE);
            i5.setVisibility(v.VISIBLE);
        }

        if(v.getId()==R.id.bg3){
            i3.setVisibility(v.GONE);
            i4.setVisibility(v.VISIBLE);

        }

        if(v.getId()==R.id.bg5){
            i5.setVisibility(v.GONE);
            i1.setVisibility(v.VISIBLE);

        }

    }
}
