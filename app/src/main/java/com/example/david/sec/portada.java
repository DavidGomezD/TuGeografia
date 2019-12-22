package com.example.david.sec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class portada extends AppCompatActivity {

    Button bjugar,btnListaEstados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);

        bjugar = (Button) findViewById(R.id.bjugar);
        btnListaEstados = (Button) findViewById(R.id.btnListaEstados);

        bjugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        btnListaEstados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(portada.this, ActivityListaEstados.class);
                startActivity(i);
            }
        });

    }

}
