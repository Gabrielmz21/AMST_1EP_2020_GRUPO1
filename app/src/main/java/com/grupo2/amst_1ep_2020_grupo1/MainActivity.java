package com.grupo2.amst_1ep_2020_grupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIniciar= findViewById(R.id.btnEmpezar);
        btnIniciar.setOnClickListener((View.OnClickListener) this);
    }

    public void Iniciar(){
        Intent intent = new Intent(MainActivity.this, Pregunta.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnEmpezar:
                Iniciar();
                break;
            case R.id.btnSalir:

                break;

        }
    }


}