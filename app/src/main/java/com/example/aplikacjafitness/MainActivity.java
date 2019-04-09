package com.example.aplikacjafitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.timer:
                intent = new Intent(MainActivity.this, TimerActivity.class);
                startActivity(intent);
                break;
            case R.id.baza:
                intent = new Intent(MainActivity.this, BazaActivity.class);
                startActivity(intent);
                break;
            case R.id.wyzwania:
                intent = new Intent(MainActivity.this, WyzwanieActivity.class);
                startActivity(intent);
                break;
            case R.id.logowanie:
                intent = new Intent(MainActivity.this, LogowanieActivity.class);
                startActivity(intent);
                break;

        }
    }
}