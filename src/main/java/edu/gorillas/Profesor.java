package edu.gorillas;

public class Profesor extends Miembro{
private String tipoJornada;
private double sueldo;
private Especialidad especialidad;

    public Profesor(String dni, String nombre, int edad, String direccion, String fechaIncorporacion, String tipoJornada, double sueldo, Especialidad especialidad) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.tipoJornada = tipoJornada;
        this.sueldo = sueldo;
        this.especialidad = especialidad;
    }
    public Profesor(){
        super();
        this.tipoJornada = "completa";
        this.sueldo = 3000;
        this.especialidad = new Especialidad();
    }
}
