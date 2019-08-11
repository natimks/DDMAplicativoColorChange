package com.example.magikoopa.myapplication;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
        // Zero absoluto em Fahrenheit  −459.67
        // Generate color1 before starting the thread
//        red1 = (int)(Math.random() * 128 + 127);
//        green1 = (int)(Math.random() * 100);
//        blue1 = (int)(Math.random() * 128 + 127);
//        color1 = 0xff << 24 | (red1 << 16) |
//                (green1 << 8) | blue1;
        LinearLayout linearLayout = findViewById(R.id.linear_layout_celcius);

        red1 = (int)(Math.random() * 128 + 127);
        green1 = (int)(Math.random() * 100);
        blue1 = (int)(Math.random() * 128 + 127);
        color1 = linearLayout.getSolidColor();


//        new Thread() {
//            public void run() {
//                while(true) {
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    CelciusForFahActivity.this.runOnUiThread(new Runnable() {
//                        public void run() {

                            //generate color 2

                            red2 = (int)(Math.random() * 128 + 127);
                            green2 = (int)(Math.random() * 100);
                            blue2 = (int)(Math.random() * 128 + 127);
                            color2 = 0xff << 24 | (red2 << 16) |
                                    (green2 << 8) | blue2;

                            //start animation
                            View v = findViewById(R.id.linear_layout_celcius);
                            ObjectAnimator anim = ObjectAnimator.ofInt(v, "backgroundColor", color1, color2);


//                            anim.setEvaluator(new ArgbEvaluator());
//                            anim.setRepeatCount(ValueAnimator.INFINITE);
//                            anim.setRepeatMode(ValueAnimator.REVERSE);
//                            anim.setDuration(3000);
                            anim.start();
//
//                            // Now set color1 to color2
//                            // This way, the background will go from
//                            // the previous color to the next color
//                            // smoothly
//                            color1 = color2;

                        }
//                    });
//                }
//            }
//        }.start();
    }

