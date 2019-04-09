package com.example.aplikacjafitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Baza_zaawansowanyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baza_zaawansowany);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void klik(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.poczatkujacy:
                intent = new Intent(Baza_zaawansowanyActivity.this, BazaActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.paski, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case  R.id.poczatkujacy:
                Toast.makeText(this, "Poziom początkujący",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void click(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.barki_btn2:
                intent = new Intent(Baza_zaawansowanyActivity.this, BarkiZaawansowanyActivity.class);
                startActivity(intent);
                break;
            case R.id.biceps_btn2:
                intent = new Intent(Baza_zaawansowanyActivity.this, BicepsZaawansowanyActivity.class);
                startActivity(intent);
                break;
            case R.id.triceps_btn2:
                intent = new Intent(Baza_zaawansowanyActivity.this, TricepsZaawansowanyActivity.class);
                startActivity(intent);
                break;
            case R.id.brzuch_btn2:
                intent = new Intent(Baza_zaawansowanyActivity.this, BrzuchZaawansowanyActivity.class);
                startActivity(intent);
                break;
            case R.id.nogi_btn2:
                intent = new Intent(Baza_zaawansowanyActivity.this, NogiZaawansowanyActivity.class);
                startActivity(intent);
                break;
            case R.id.klatka_btn2:
                intent = new Intent(Baza_zaawansowanyActivity.this, KlatkaZaawansowanyActivity.class);
                startActivity(intent);
                break;
            case R.id.plecy_btn2:
                intent = new Intent(Baza_zaawansowanyActivity.this, PlecyZaawansowanyActivity.class);
                startActivity(intent);
                break;
        }
    }

}
