package edu.gorillas;

import java.util.Scanner;

public class Operaciones {
    public static Miembro recogerDatosMiembro(int c) {
        String dni = "";
        String nom = "";
        int edad = 0;
        String direccion = "";
        String fecha = "";
        double importeM = 0.0;
        String cicloA = "";
        double mediaN = 0.0;
        String tipoJ = "";
        double sueldoP = 0.0;
        int espId = 0;
        String espNom = "";
        Scanner scan = new Scanner(System.in);
        //Pedimos el dni
        System.out.println("Introduzca el DNI de " + nom + ": ");
        dni = Validar.dni(scan.next());
        //Pedimos el nombre
        System.out.println("Introduzca el nombre del empleado " + c + ": ");
        nom = Validar.nombre(scan.next());
        //Pedimos la edad
        System.out.println("Introduzca la edad de " + nom + ": ");
        edad = Validar.edad(scan.nextInt());
        //Pedimos la direccion
        System.out.println("Introduzca la direccion de " + nom + ": ");
        direccion = scan.nextLine();

        //Pedimos la fecha
        System.out.println("Introduzca la fecha de incorporacion de " + nom + ": ");
        fecha = Validar.fecha(scan.nextLine());

        //Pedimos la importe Matricula
        System.out.println("Introduzca el importe de la matricual de " + nom + ": ");
        importeM = scan.nextDouble();

        System.out.println("Introduzca la el ciclo actual de " + nom + ": ");
        cicloA = scan.nextLine();

        //Pedimos la nota media
        System.out.println("Introduzca la nota media de " + nom + ": ");
        mediaN = scan.nextDouble();

        System.out.println("Introduzca tipo de jornada de " + nom + " completa o parcial : ");
        tipoJ = scan.nextLine();

        System.out.println("Introduzca el sueldo de " + nom + ": ");
        sueldoP = scan.nextDouble();

        System.out.println("Introduzca el id de la especialidad: ");
        espId = scan.nextInt();

        System.out.println("Introduzca el nombre de la especialidad: ");
        espNom = scan.nextLine();

        System.out.println("¿Qué tipo de miembro es? Alumno:1, Profesor:2");
        int tipo = scan.nextInt();


        Miembro m = null;
        if (tipo == 1) {
            m = new Alumno(dni, nom, edad, direccion, fecha, cicloA, importeM, mediaN);
        } else {
            m = new Profesor(dni, nom, edad, direccion, fecha, tipoJ, sueldoP, new Especialidad(espId, espNom));
        }
        m.aplicarBonificacion(fecha);
        return m;
    }
}


