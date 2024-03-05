package edu.gorillas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alumno extends Miembro{

    private String cicloActual;
    private double mediaNotas;
    private double importeMatricula;

    public Alumno(String dni, String nombre, int edad, String direccion, String fechaIncorporacion, String cicloActual, double mediaNotas, double importeMatricula) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.cicloActual = cicloActual;
        this.mediaNotas = mediaNotas;
        this.importeMatricula = importeMatricula;

    }
    public Alumno(){
        super();
        this.cicloActual = "DAW dual";
        this.mediaNotas = 7.5;
        this.importeMatricula = 0.0;
    }

    public String getCicloActual() {
        return cicloActual;
    }

    public void setCicloActual(String cicloActual) {
        this.cicloActual = cicloActual;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public double getImporteMatricula() {
        return importeMatricula;
    }

    public void setImporteMatricula(double importeMatricula) {
        this.importeMatricula = importeMatricula;
    }

    @Override
    public void aplicarBonificacion(String fechaIncorporacion) {

        super.aplicarBonificacion(fechaIncorporacion);
            LocalDate fechaIncorporacionDate = LocalDate.parse(fechaIncorporacion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate hoy = LocalDate.now();

            if (fechaIncorporacionDate.plusYears(2).isBefore(hoy)) {
                importeMatricula*= 0.9; // Reducción del 10%
                setImporteMatricula(importeMatricula);
                System.out.println("La matrícula de " + getNombre() + " ha sido reducida en un 10%");
            } else {
                System.out.println("No se aplicó bonificación a la matrícula de " + getNombre());
            }
        }
    }


