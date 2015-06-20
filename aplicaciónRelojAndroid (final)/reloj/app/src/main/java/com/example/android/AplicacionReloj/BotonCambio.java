package com.example.android.AplicacionReloj;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Maria Valerio on 19/06/2015.
 */
public class BotonCambio extends Activity {

    Button boton;
    boolean flag = true;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cambioboton);
        boton = (Button) findViewById(R.id.btn_change);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    boton.setBackgroundResource(R.drawable.cambio2);
                    flag = false;
                } else {
                    boton.setBackgroundResource(R.drawable.cambio1);
                    flag = true;
                }
            }
        });
    }
}