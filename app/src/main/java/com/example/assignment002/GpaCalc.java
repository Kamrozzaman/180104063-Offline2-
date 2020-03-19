package com.example.assignment002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

public class GpaCalc extends AppCompatActivity implements View.OnClickListener {

    Button B1;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    EditText g1,g2,g3,g4,g5,g6,g7,g8,g9,g10;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_calc);
        B1 = findViewById(R.id.b1);
        e1 =findViewById(R.id.e1);
        e2 =findViewById(R.id.e2);
        e3 =findViewById(R.id.e3);
        e4 =findViewById(R.id.e4);
        e5 =findViewById(R.id.e5);
        e6 =findViewById(R.id.e6);
        e7 =findViewById(R.id.e7);
        e8 =findViewById(R.id.e8);
        e9 =findViewById(R.id.e9);
        e10 =findViewById(R.id.e10);
        t1 = findViewById(R.id.t1);

        g1 =findViewById(R.id.g1);
        g2 =findViewById(R.id.g2);
        g3 =findViewById(R.id.g3);
        g4 =findViewById(R.id.g4);
        g5 =findViewById(R.id.g5);
        g6 =findViewById(R.id.g6);
        g7 =findViewById(R.id.g7);
        g8 =findViewById(R.id.g8);
        g9 =findViewById(R.id.g9);
        g10 =findViewById(R.id.g10);
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

        String str , str1;
        double d1=0.0, d2=0.0,a,b;
        int e=0;

        str=g1.getText().toString();

        if(str.length()!=0){
            str1=e1.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }


        str=g2.getText().toString();

        if(str.length()!=0){
            str1=e2.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        str=g3.getText().toString();

        if(str.length()!=0){
            str1=e3.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        str=g4.getText().toString();

        if(str.length()!=0){
            str1=e4.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        str=g5.getText().toString();

        if(str.length()!=0){
            str1=e5.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        str=g6.getText().toString();

        if(str.length()!=0){
            str1=e6.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        str=g7.getText().toString();

        if(str.length()!=0){
            str1=e7.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        str=g8.getText().toString();

        if(str.length()!=0){
            str1=e8.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        str=g9.getText().toString();

        if(str.length()!=0){
            str1=e9.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        str=g10.getText().toString();

        if(str.length()!=0){
            str1=e10.getText().toString();
            a=Double.parseDouble(str);

            if(a==0.0)
                e=1;

            b=Double.parseDouble(str1);

            d2+=b;
            d1=d1+(a*b);
        }

        d1=d1/d2;

        double rounded1 = round(d1, 2);
        str=String.valueOf(rounded1);

        if(e==0)
        t1.setText(str);

        else
            t1.setText("FAILED");





    }
}
