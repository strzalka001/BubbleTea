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

            case R.id.menu_onas:
                return true;

            case R.id.menu_opinia:
                Intent intent = new Intent(this, Opinion.class);
                startActivity(intent);

                return true;

            case R.id.menu_koszyk:
                Intent intentk = new Intent(this, KoszykActivity.class);
                startActivity(intentk);
                return true;

            case R.id.menu_lokale:
                Intent intentl = new Intent(this, Lokale.class);
                startActivity(intentl);
                return true;

            case R.id.menu_opcje:
                Intent intento = new Intent(this, Opcje.class);
                startActivity(intento);
                return true;

            case R.id.menu_kontakt:
                Intent intent2 = new Intent(this, Kontakt.class);
                startActivity(intent2);
                return true;

            case R.id.btnNajpopularniejsze:
                Intent intent3 = new Intent(this, Najpopularniejsze.class);
                startActivity(intent3);
                return true;


            case R.id.btnPromocje:
                Intent intent4 = new Intent(this, Promocje.class);
                startActivity(intent4);
                return true;

            case R.id.btnPomoc:
                Intent intent5 = new Intent(this, Pomoc.class);
                startActivity(intent5);
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
