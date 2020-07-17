package com.grupo2.amst_1ep_2020_grupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PartidaPerdida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida_perdida);
    }

    public void VolverAJugar(){
        Intent intent = new Intent(PartidaPerdida.this, MainActivity.class);
        startActivity(intent);
    }

    public void Salir(){

    }
}