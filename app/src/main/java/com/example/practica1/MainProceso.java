package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainProceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_proceso);

        TextView RecibeSaludo = (TextView) findViewById(R.id.txtSaludo);
        Bundle bundle = this.getIntent().getExtras();
        RecibeSaludo.setText("HOLA BIENVENIDO: \n"+bundle.getString("NOMBRE"));
    }
    public void ATRAS(){
        Intent intent= new Intent(MainProceso.this, MainActivity.class);
        startActivity(intent);
    }

}