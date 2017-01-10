package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PotiwerdzenieZgloszenia extends AppCompatActivity {

    private ImageView mDodaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potiwerdzenie_zgloszenia);
        mDodaj = (ImageView) findViewById(R.id.imageView10);
        addListenerOnButtonZadajPytan();
    }

    public void addListenerOnButtonZadajPytan() {
        final Context context = this;
        mDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
