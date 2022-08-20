package com.example.mascotas;

public class Mascotas {
    private String nombre;
    private int foto,rating=0;



    public Mascotas(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getContador() {
        return rating;
    }

    public void setContador(int contador) {
        this.rating = contador;
    }
}
