package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Zgloszenie extends AppCompatActivity {

    private Button mDodaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zgloszenie);

        mDodaj = (Button) findViewById(R.id.btnSend);
        addListenerOnButtonZadajPytanie();
    }

    public void addListenerOnButtonZadajPytanie() {
        final Context context = this;
        mDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, PotiwerdzenieZgloszenia.class);
                startActivity(intent);
            }
        });
    }
}
