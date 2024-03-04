package edu.gorillas;

public class Especialidad {
    private int identificador;
    private String nombre;

    public Especialidad(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    public Especialidad(){
        this.identificador = 0;
        this.nombre = "Sin especialidad";
    }
}