package com.example.david.sec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    TextView TusPuntos;
    Button bFin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        //Poner icono en action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        TusPuntos = (TextView) findViewById(R.id.TuPuntuacion);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("MandarPuntos");

        TusPuntos.setText("Puntuación: "+dato);

        bFin = (Button) findViewById(R.id.bFin);

        bFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), portada.class);
                startActivity(i);
                //termina la actividad para que no se pueda regresar
                finish();
            }
        });
        
    }
}
