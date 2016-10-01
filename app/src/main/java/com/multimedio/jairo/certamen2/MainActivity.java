package com.multimedio.jairo.certamen2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView Titulo;
    EditText nombre_c;
    Button Inicio_c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Titulo = (TextView) findViewById(R.id.Titulo);
        nombre_c = (EditText) findViewById(R.id.Nombre);
        Inicio_c = (Button) findViewById(R.id.Inicio);

        Titulo.setOnClickListener(this);
        nombre_c.setOnClickListener(this);
        Inicio_c.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Inicio:
                Intent intent = new Intent(MainActivity.this, UsuarioActivity.class);
                startActivity(intent);
                break;
        }
    }
    }

