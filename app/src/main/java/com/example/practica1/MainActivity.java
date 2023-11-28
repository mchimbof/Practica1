package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Enviar(View view){
        EditText saludonombre=(EditText) findViewById(R.id.txtNombre);

        Toast.makeText(getApplicationContext(), "ENVIAR: " + saludonombre.getText().toString(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, MainProceso.class);
        Bundle EnviaSaludo = new Bundle();
        EnviaSaludo.putString("NOMBRE",saludonombre.getText().toString());
        intent.putExtras(EnviaSaludo);

        startActivity(intent);
    }

}