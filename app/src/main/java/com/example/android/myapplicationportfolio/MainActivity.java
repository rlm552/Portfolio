package com.example.android.myapplicationportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Calls Toast when user clicks button */
    public void toastMessage1(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();

    }

    /* Calls Toast when user clicks button */
    public void toastMessage2(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /* Calls Toast when user clicks button */
    public void toastMessage3(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /* Calls Toast when user clicks button */
    public void toastMessage4(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Make Your App Material App";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /* Calls Toast when user clicks button */
    public void toastMessage5(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Go Ubiquitous App!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /* Calls Toast when user clicks button */
    public void toastMessage6(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }
}
