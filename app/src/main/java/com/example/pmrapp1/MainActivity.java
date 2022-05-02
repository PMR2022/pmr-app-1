package com.example.pmrapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String CAT = "PMR2022";
    Button refBtnOK;
    EditText refEdtPseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(CAT,"onCreate");

        // Référence vers le bouton OK
        refBtnOK = findViewById(R.id.btnOK);
        refEdtPseudo = findViewById(R.id.pseudo);

        // Affection d'un gestionnaire de click
        refBtnOK.setOnClickListener(this);
        refEdtPseudo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btnOK: alerter("click sur BtnOK (3)");
            // Objectif : déclencher une nouvelle activité
            // en lui passant la valeur du champ saisi par l'utilisateur
                alerter("contenu actuel : " + refEdtPseudo.getText().toString());
                Intent versSecondAct;
                Bundle b = new Bundle();
                b.putString("pseudo",refEdtPseudo.getText().toString());

                versSecondAct = new Intent(this,SecondActivity.class);
                versSecondAct.putExtras(b);
                startActivity(versSecondAct);
            break;
            case R.id.pseudo: alerter("click sur pseudo");
            break;
        }
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

    // Réaction au clic sur bouton :
    // 1) attribut android:onClick="foo" dans le bouton dans le layout
    public void foo(View view) {
        alerter("click sur BtnOK");
    }


}