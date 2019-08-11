package com.example.magikoopa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class SwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        Switch sw = findViewById(R.id.switch_opc);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textView = findViewById(R.id.textView1);
                if (isChecked) {
                    textView.setText("Amperagem");
                } else {
                    textView.setText("Potencia");
                }
            }
        });
    }

    public void onClickCalcular(View view) {
        Switch sw = (Switch) findViewById(R.id.switch_opc);
        EditText amp  =findViewById(R.id.editText1);
        EditText voltagem  =findViewById(R.id.editText2);
        if (sw.isChecked()) {
            //P(Watts) = i(Amperes)*Voltagem
            Double ampers = Double.parseDouble(amp.getText().toString());
            Double volts = Double.parseDouble(voltagem.getText().toString());
            Double potencia = ampers*volts;
            TextView tv = findViewById(R.id.resultado_tela2_tv);
            tv.setText("Potencia: "+potencia);
        } else {
            Double ampers = Double.parseDouble(amp.getText().toString());
            Double volts = Double.parseDouble(voltagem.getText().toString());
            Double corrente = ampers/volts;
            TextView tv = findViewById(R.id.resultado_tela2_tv);
            tv.setText("Corrente: "+corrente);
        }
    }


}
