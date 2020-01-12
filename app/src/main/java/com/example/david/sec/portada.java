package com.example.david.sec;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class portada extends AppCompatActivity {

    Button bjugar,btnListaEstados, btnInformacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_portada);

        //Poner icono en action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        //Id de los botones
        bjugar = (Button) findViewById(R.id.bjugar);
        btnInformacion = (Button) findViewById(R.id.botonInformacion);
        btnListaEstados = (Button) findViewById(R.id.btnListaEstados);

        //Eventos de click
        bjugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // animacion en cambio de activity
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(portada.this);
                // iniciamos el cambio de actividad
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i, options.toBundle());
            }
        });

        btnListaEstados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // iniciamos el cambio de actividad
                Intent i = new Intent(portada.this, ActivityListaEstados.class);
                startActivity(i);
            }
        });

        btnInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // iniciamos el cambio de actividad
                Intent i = new Intent(portada.this, InformacionApp.class);
                startActivity(i);
            }
        });
    }
}
