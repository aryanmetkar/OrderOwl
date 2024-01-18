package com.example.orderowl.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.orderowl.R;

public class SplashColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.red));
    }
}