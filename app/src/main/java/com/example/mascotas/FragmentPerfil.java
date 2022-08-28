package com.example.mascotas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FragmentPerfil extends Fragment {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listamascotas;

    public FragmentPerfil() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listamascotas = v.findViewById(R.id.rvgrid);
        GridLayoutManager glm = new GridLayoutManager(v.getContext(),3);
        glm.setOrientation(GridLayoutManager.VERTICAL);
        listamascotas.setLayoutManager(glm);

        iniciarmascotas();
        iniciaradaptador();

        return v;
    }

    public void iniciaradaptador(){
        MascotagridAdapter ma = new MascotagridAdapter(mascotas);
        listamascotas.setAdapter(ma);
    }

    public void iniciarmascotas(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascotas(R.drawable.uno,10));
        mascotas.add(new Mascotas(R.drawable.dos,6));
        mascotas.add(new Mascotas(R.drawable.tres,8));
        mascotas.add(new Mascotas(R.drawable.cuatro,5));
        mascotas.add(new Mascotas(R.drawable.cinco,0));
        mascotas.add(new Mascotas(R.drawable.seis,4));
        mascotas.add(new Mascotas(R.drawable.siete,8));
        mascotas.add(new Mascotas(R.drawable.ocho,9));
        mascotas.add(new Mascotas(R.drawable.nueve,9));

    }
}