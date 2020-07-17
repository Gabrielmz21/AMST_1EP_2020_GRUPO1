package com.grupo2.amst_1ep_2020_grupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PartidaPerdida extends AppCompatActivity {
    Button btnJugar;
    Button btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida_perdida);

        btnJugar = findViewById(R.id.btnJugar);
        btnSalir = findViewById(R.id.btnSalir);
        btnJugar.setOnClickListener((View.OnClickListener) this);
        btnSalir.setOnClickListener((View.OnClickListener) this);
    }

    public void volverAJugar(){
        Intent intent = new Intent(PartidaPerdida.this, MainActivity.class);
        startActivity(intent);
    }

    public void Salir(){
        Intent intent = new Intent(PartidaPerdida.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnJugar:
                volverAJugar();
                break;
            case R.id.btnSalir:
                Salir();
                break;

        }
    }
}