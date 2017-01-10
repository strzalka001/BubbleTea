package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pomoc extends AppCompatActivity {

    private Button mZgloszenie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomoc);

        mZgloszenie = (Button) findViewById(R.id.btnAdd);
        addListenerOnButtonDodajZgloszenie();
    }

    public void addListenerOnButtonDodajZgloszenie() {
        final Context context = this;
        mZgloszenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Zgloszenie.class);
                startActivity(intent);
            }
        });
    }
}
