package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Logowanie extends AppCompatActivity {

    private Button mPotwierdzenie;
    private Button mPrzypomnij;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logowanie);
        mPotwierdzenie = (Button) findViewById(R.id.btnLogowanie);
        mPrzypomnij = (Button) findViewById(R.id.btnNoweHaslo);
        addListenerOnButtonPotwierdzenieLogowania();
        addListenerOnButtonPrzypomnijHaslo();
    }

    public void addListenerOnButtonPotwierdzenieLogowania() {
        final Context context = this;
        mPotwierdzenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, LoginSuccess.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonPrzypomnijHaslo() {
        final Context context = this;
        mPrzypomnij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, RemaindPass.class);
                startActivity(intent);
            }
        });
    }
}
