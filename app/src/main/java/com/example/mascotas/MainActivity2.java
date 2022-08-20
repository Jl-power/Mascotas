package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView listamascotas;
    private ArrayList<Mascotas> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(view -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });

        listamascotas = findViewById(R.id.rvmascotas2);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listamascotas.setLayoutManager(llm);

        iniciarmascotas();
        iniciaradaptador();

    }

    public void iniciaradaptador(){
        MascotaAdapter ma = new MascotaAdapter(mascotas);
        listamascotas.setAdapter(ma);
    }

    public void iniciarmascotas(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascotas("Flex",R.drawable.perro2));
        mascotas.add(new Mascotas("Moro",R.drawable.perro3));
        mascotas.add(new Mascotas("Terry",R.drawable.perro4));
        mascotas.add(new Mascotas("Max",R.drawable.perro5));
        mascotas.add(new Mascotas("Dory",R.drawable.perro6));
    }
}