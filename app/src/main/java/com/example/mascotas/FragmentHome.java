package com.example.mascotas;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listamascotas;

    public FragmentHome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        listamascotas = v.findViewById(R.id.rvmascotas2);
        LinearLayoutManager llm = new LinearLayoutManager(v.getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listamascotas.setLayoutManager(llm);

        iniciarmascotas();
        iniciaradaptador();

        return v;
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

