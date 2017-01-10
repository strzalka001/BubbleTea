package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Promocje extends AppCompatActivity {

    private Button mPowrot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promocje);
        mPowrot = (Button) findViewById(R.id.backButton);
        addListenerOnButtonPowrot();

    }

    public void addListenerOnButtonPowrot() {
        final Context context = this;
        mPowrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
