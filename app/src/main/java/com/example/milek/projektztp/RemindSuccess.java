package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RemindSuccess extends AppCompatActivity {

    private ImageView mPotwierdzenie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remind_success);

        mPotwierdzenie = (ImageView) findViewById(R.id.imageView2);
        addListenerOnButtonPotwierdzenie();
    }

    public void addListenerOnButtonPotwierdzenie() {
        final Context context = this;
        mPotwierdzenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
