package com.grupo2.amst_1ep_2020_grupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Iniciar(){
        Intent intent = new Intent(MainActivity.this, Pregunta.class);
        startActivity(intent);
    }

}