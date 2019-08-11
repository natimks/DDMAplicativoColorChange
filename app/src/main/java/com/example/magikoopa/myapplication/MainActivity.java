package com.example.magikoopa.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBotaoUm(View view) {
        Intent myIntent = new Intent(MainActivity.this, CelciusForFahActivity.class);
        this.startActivity(myIntent);
    }

    public void onClickBotaoDois(View view) {
        Intent myIntent = new Intent(MainActivity.this, SwitchActivity.class);
        this.startActivity(myIntent);
    }
}
