package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RemaindPass extends AppCompatActivity {

    private Button mPotwierdzenie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remaind_pass);
        mPotwierdzenie = (Button) findViewById(R.id.btnRemindMe);
        addListenerOnButtonPotwierdzenie();
    }

    public void addListenerOnButtonPotwierdzenie() {
        final Context context = this;
        mPotwierdzenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, RemindSuccess.class);
                startActivity(intent);
            }
        });
    }
}
