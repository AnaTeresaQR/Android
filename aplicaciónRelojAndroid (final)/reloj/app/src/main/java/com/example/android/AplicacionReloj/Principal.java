package com.example.android.AplicacionReloj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 */
public class Principal extends Activity {

    Button verReloj;
    Button verImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        verReloj = (Button) findViewById(R.id.btn_reloj); // inicializa el boton del reloj
        verImg = (Button) findViewById(R.id.btn_cambio);

        verReloj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarReloj();
            }
        });
        verImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarImg();
            }
        });
    }

    public void mostrarReloj() {
        Intent i = new Intent(this, RelojDigital.class);
        startActivity(i);
    }

    public void mostrarImg() {
        Intent i = new Intent(this, BotonCambio.class);
        startActivity(i);
    }
}
