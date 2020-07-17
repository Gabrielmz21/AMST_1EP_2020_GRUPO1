package com.grupo2.amst_1ep_2020_grupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Pregunta5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5);
    }

    public void Siguiente(){
        Intent intent = new Intent(this, PartidaGanada.class);
        startActivity(intent);
    }

    public void Error(){
        Intent intent = new Intent(this, PartidaPerdida.class);
        startActivity(intent);
    }
}