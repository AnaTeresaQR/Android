package com.example.android.AplicacionReloj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {

    Button bienvenido;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bienvenido = (Button)findViewById(R.id.btn_iniciar); // inicializa el boton iniciar
        bienvenido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarPrincipal();
            }
        });
    }

    public void mostrarPrincipal() {
        Intent i = new Intent(this, Principal.class);
        startActivity(i);
    }
}
