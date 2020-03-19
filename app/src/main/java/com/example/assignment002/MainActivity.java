package com.example.assignment002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.gradingsystem);
        b2 =findViewById(R.id.gpabutton);
        b3= findViewById(R.id.cgpabutton);
        b4= findViewById(R.id.help);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.gradingsystem) {
            Intent grad = new Intent(MainActivity.this, GradingSystem.class);
            startActivity(grad);

        }

        if(v.getId()==R.id.gpabutton){
            Intent grad = new Intent(MainActivity.this, GpaCalc.class);
            startActivity(grad);

        }

        if(v.getId()==R.id.cgpabutton){
            Intent grad = new Intent(MainActivity.this, CgpaCal.class);
            startActivity(grad);

        }



        if(v.getId()==R.id.help){
            Intent grad = new Intent(MainActivity.this, Help.class);
            startActivity(grad);

        }

    }
}
