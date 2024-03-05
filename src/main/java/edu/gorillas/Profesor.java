package edu.gorillas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public void aplicarBonificacion(String fechaIncorporacion) {

        super.aplicarBonificacion(fechaIncorporacion);
        LocalDate fechaIncorporacionDate = LocalDate.parse(fechaIncorporacion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate hoy = LocalDate.now();

        if (fechaIncorporacionDate.plusYears(3).isBefore(hoy)) {
            sueldo*= 1.15; // aumento del 15%
            setSueldo(sueldo);
            System.out.println("El sueldo de " + getNombre() + " ha sido aumentado en un 15%");
        } else {
            System.out.println("No se aplicó bonificación de sueldo de " + getNombre());
        }
    }
}
}
