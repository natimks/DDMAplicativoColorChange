package com.example.magikoopa.myapplication;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CelciusForFahActivity extends AppCompatActivity {
    Integer red1;
    Integer green1;
    Integer blue1;
    Integer color1;

    Integer red2;
    Integer green2;
    Integer blue2;
    Integer color2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_for_fah);
    }

    public void onClickBotaoCelcius(View view) {
        EditText celciusEd =findViewById(R.id.celcius_ed);
        Double celcius = Double.parseDouble(celciusEd.getText().toString());
        Double fah = (celcius*9)/5+32;
        TextView fahreTv = findViewById(R.id.resultado_tv);
        fahreTv.setText(fah+" F");
        Double kelvin = (celcius + 273.15)/100;
        if(celcius >-173.15){
            kelvin = 1.0;
        }else if(celcius <-273.15){
            kelvin= 0.0;
        }
        // Zero absoluto em celcius -273.15
        // PARA VERMELHO
        red1 = 255;
        green1 = 1;
        blue1 = 1;
        color1 = 0xff << 24 | (red1 << 16) |
                (green1 << 8) | blue1;

        // PARA AZUL
        red2 = 1;
        green2 = 1;
        blue2 = 255;
        color2 = 0xff << 24 | (red2 << 16) |
                (green2 << 8) | blue2;

        Integer novaCor = lerp(kelvin);

        View v = findViewById(R.id.linear_layout_celcius);
        v.setBackgroundColor(novaCor);

    }

    public int lerp(double   t) {
        int red =  (int) ( ((1.0 - t) * 1) + (255 * t));
        int green = (int) ( ((1.0 - t) * 1) + (1 * t));
        int blue =  (int) ( ((1.0 - t) * 255) + (1 * t));
        return Color.rgb(red,green,blue);
    }
}

