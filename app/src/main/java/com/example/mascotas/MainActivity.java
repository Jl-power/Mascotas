package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listamascotas;
    private Toolbar toolbar;
    private ImageView imageView,imageView2, imageView3;
    private TextView titulo;
    private FloatingActionButton boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listamascotas = findViewById(R.id.rvmascotas2);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listamascotas.setLayoutManager(llm);


        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        imageView = findViewById(R.id.icono1);
        titulo = findViewById(R.id.titulo);
        imageView2 = findViewById(R.id.icono2);
        boton = findViewById(R.id.floatingActionButton);
        imageView3 = findViewById(R.id.icono3);

        iniciarmascotas();
        iniciaradaptador();

        imageView3.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        });

    }

    public void iniciaradaptador(){
        MascotaAdapter ma = new MascotaAdapter(mascotas);
        listamascotas.setAdapter(ma);
    }

    public void iniciarmascotas(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascotas("Cuper",R.drawable.perro1));
        mascotas.add(new Mascotas("Flex",R.drawable.perro2));
        mascotas.add(new Mascotas("Moro",R.drawable.perro3));
        mascotas.add(new Mascotas("Terry",R.drawable.perro4));
        mascotas.add(new Mascotas("Max",R.drawable.perro5));
        mascotas.add(new Mascotas("Dory",R.drawable.perro6));
    }
}