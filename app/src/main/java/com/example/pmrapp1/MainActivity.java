package com.example.pmrapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String CAT = "PMR2022";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(CAT,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(CAT,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(CAT,"onRestart");
    }
}