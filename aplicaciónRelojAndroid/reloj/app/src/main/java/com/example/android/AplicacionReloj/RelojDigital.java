package com.example.android.AplicacionReloj;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.DigitalClock;

/**
 * Clase com.example.android.reloj.RelojDigital
 */
public class RelojDigital extends Activity {

    DigitalClock relojDigital;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reloj);
        relojDigital =(DigitalClock) findViewById(R.id.btn_reloj);
    }
}
