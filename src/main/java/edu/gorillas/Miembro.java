package edu.gorillas;

public class Miembro extends Persona{
    private String fechaIncorporacion;

    public Miembro(String dni, String nombre, int edad, String direccion, String fechaIncorporacion) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
    }
    public Miembro(){
        super();
        this.fechaIncorporacion = "20/09/2023";
    }

    public String getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(String fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public void aplicarBonificacion(String fechaIncorporacion){}
}
