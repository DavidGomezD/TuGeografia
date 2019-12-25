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

        TusPuntos = (TextView) findViewById(R.id.TuPuntuacion);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("MandarPuntos");

        TusPuntos.setText("Fin del juego puntuación: "+dato);

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
