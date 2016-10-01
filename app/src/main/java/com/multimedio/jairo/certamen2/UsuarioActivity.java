package com.multimedio.jairo.certamen2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class UsuarioActivity extends AppCompatActivity implements View.OnClickListener{

    TextView contenido;
    TextView Titulo;
    TextView descripcion;
    TextView update;
    TextView usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        contenido = (TextView) findViewById(R.id.contenido);
        Titulo = (TextView) findViewById(R.id.Titulo);
        descripcion = (TextView) findViewById(R.id.descripcion);
        update = (TextView) findViewById(R.id.update);
        usuario = (TextView) findViewById(R.id.usuario);

        contenido.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
