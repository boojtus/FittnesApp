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

public class BazaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baza);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void klik(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.zaawansowany:
                intent = new Intent(BazaActivity.this, Baza_zaawansowanyActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.paski2, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()){
             case  R.id.zaawansowany:
                 Toast.makeText(this, "Poziom zaawansowany",Toast.LENGTH_SHORT).show();
                 return true;
             default:
                 return super.onOptionsItemSelected(item);
         }
    }

    public void click(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.barki_btn:
                intent = new Intent(BazaActivity.this, BarkiActivity.class);
                startActivity(intent);
                break;
            case R.id.biceps_btn:
                intent = new Intent(BazaActivity.this, BicepsActivity.class);
                startActivity(intent);
                break;
            case R.id.triceps_btn:
                intent = new Intent(BazaActivity.this, TricepsActivity.class);
                startActivity(intent);
                break;
            case R.id.brzuch_btn:
                intent = new Intent(BazaActivity.this, BrzuchActivity.class);
                startActivity(intent);
                break;
            case R.id.nogi_btn:
                intent = new Intent(BazaActivity.this, NogiActivity.class);
                startActivity(intent);
                break;
            case R.id.klatka_btn:
                intent = new Intent(BazaActivity.this, KlatkaActivity.class);
                startActivity(intent);
                break;
            case R.id.plecy_btn:
                intent = new Intent(BazaActivity.this, PlecyActivity.class);
                startActivity(intent);
                break;
        }
    }
}
