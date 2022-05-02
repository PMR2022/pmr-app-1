package com.example.pmrapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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

    // traces d'exécution visuelles dans l'écran du tél.
    private void alerter(String s) {
        Log.i(CAT,s);
        Toast t = Toast.makeText(this,s, Toast.LENGTH_SHORT);
        t.show();
    }

    public void foo(View view) {
        alerter("click sur BtnOK");
    }
}