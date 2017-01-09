package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Opinion extends AppCompatActivity {


    Button DodajOpinia;
    EditText TwojaOpinia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinion);
        DodajOpinia = (Button) findViewById(R.id.buttonOpinia);
        TwojaOpinia = (EditText) findViewById(R.id.editTextOpinia);
        addListenerOnButtonKoszyk();
    }


    public void addListenerOnButtonKoszyk() {
        final Context context = this;
        DodajOpinia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Toast.makeText(Opinion.this,
                        "Dodano opinię!",
                        Toast.LENGTH_SHORT).show();
                TwojaOpinia.setText("");
            }
        });
    }





}
