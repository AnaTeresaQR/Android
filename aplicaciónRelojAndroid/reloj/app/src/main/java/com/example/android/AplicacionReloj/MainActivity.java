package com.example.android.AplicacionReloj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {

    Button verReloj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verReloj = (Button)findViewById(R.id.btn_reloj); // inicializa el boton del reloj
        verReloj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarReloj();
            }
        });

    }

    public void mostrarReloj() {
        Intent i = new Intent(this, RelojDigital.class);
        startActivity(i);
    }
}
