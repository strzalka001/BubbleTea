package com.example.milek.projektztp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button produkty;
    Button herbaty;
    Button koszyk;
    Button web;
    private Button mLogowanie;
    private Button mRejestracja;
    ArrayList<Produkt> kosz = new ArrayList<Produkt>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        produkty = (Button) findViewById(R.id.buttonProdukty);
        herbaty = (Button) findViewById(R.id.buttonHerbaty);
        koszyk = (Button) findViewById(R.id.buttonKoszyk);
        mLogowanie = (Button) findViewById(R.id.log);
        mRejestracja = (Button) findViewById(R.id.reg);
        web = (Button) findViewById(R.id.buttonWeb);
        addListenerOnButtonProdukty();
        addListenerOnButtonHerbaty();
        addListenerOnButtonKoszyk();
        addListenerOnButtonLogowanie();
        addListenerOnButtonRejestracja();
        addListenerOnButtonWeb();

        kosz.add(new Produkt("colka", 3, "mniam"));

        // kosz = (ArrayList<Produkt>) getIntent().getSerializableExtra("kosz");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bubble_menu, menu); //your file name
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.powrot:
                super.finish();
                return true;

            case R.id.guzik1:

            case R.id.menu_opinia:
                Intent intent = new Intent(this, Opinion.class);
                startActivity(intent);

                return true;

            case R.id.guzik2:
                //your code
                return true;

            case R.id.guzik3:

                return true;

            case R.id.guzik4:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }






    public void addListenerOnButtonProdukty() {
        final Context context = this;
        produkty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, ProduktyActivity.class);
                intent.putExtra("kosz", kosz);
                startActivity(intent);
            }
        });
    }


    public void addListenerOnButtonHerbaty() {
        final Context context = this;
        herbaty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, HerbatyActivity.class);
                intent.putExtra("kosz", kosz);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonKoszyk() {
        final Context context = this;
        koszyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, KoszykActivity.class);
                intent.putExtra("kosz", kosz);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonRejestracja() {
        final Context context = this;
        mRejestracja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Rejestracja.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonLogowanie() {
        final Context context = this;
        mLogowanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Logowanie.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButtonWeb() {
        final Context context = this;
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Web.class);
                startActivity(intent);
            }
        });
    }




}
