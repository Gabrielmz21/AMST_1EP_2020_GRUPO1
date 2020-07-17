package com.grupo2.amst_1ep_2020_grupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PartidaGanada extends AppCompatActivity {
    Button btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida_ganada);
        btnSalir= findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener((View.OnClickListener) this);
    }

    public void Salir(){
        Intent intent = new Intent(PartidaGanada.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSalir:
                Salir();
                break;
            case R.id.btnEmpezar:
                break;

        }
    }
}