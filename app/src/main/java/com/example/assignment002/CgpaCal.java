package com.example.assignment002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CgpaCal extends AppCompatActivity implements View.OnClickListener{





    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    Button B1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_cal);

        B1 = findViewById(R.id.b1);
        e1 =findViewById(R.id.e1);
        e2 =findViewById(R.id.e2);
        e3 =findViewById(R.id.e3);
        e4 =findViewById(R.id.e4);
        e5 =findViewById(R.id.e5);
        e6 =findViewById(R.id.e6);
        e7 =findViewById(R.id.e7);
        e8 =findViewById(R.id.e8);

        t1=findViewById(R.id.t1);

        B1.setOnClickListener(this);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }


    @Override
    public void onClick(View v) {
        String str;
        double d1=0.0,d2=0.0,a;

        str = e1.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }

        str = e2.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }

        str = e3.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }

        str = e4.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }

        str = e5.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }

        str = e6.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }

        str = e6.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }

        str = e7.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }

        str = e8.getText().toString();

        if(str.length()!=0){
            d2=d2+1;

            a=Double.parseDouble(str);
            d1=d1+a;
        }





        d1=d1/d2;
        double rounded1 = round(d1, 2);
        str=String.valueOf(rounded1);

        t1.setText(str);
    }
}
