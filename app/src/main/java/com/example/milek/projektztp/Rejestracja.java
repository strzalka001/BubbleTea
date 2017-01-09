package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rejestracja extends AppCompatActivity {

    private Button mPotwierdzenie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejestracja);
        mPotwierdzenie = (Button) findViewById(R.id.btnRejestracja);
        addListenerOnButtonPotwierdzenieRejestracji();
    }

    public void addListenerOnButtonPotwierdzenieRejestracji() {
        final Context context = this;
        mPotwierdzenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, RegisterSuccess.class);
                startActivity(intent);
            }
        });
    }
}
