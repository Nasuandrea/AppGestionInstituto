package edu.gorillas;
import java.util.ArrayList;
import java.util.Scanner;
public class MiembroExcep {
    public static void main(String[] args) {
        int c = 1, opcion = 0; //Contador y registro de opcion
        //Objeto lector
        Scanner scan = new Scanner(System.in);

        //Creamos un arraylist de miembros
        ArrayList<Miembro> miem = new ArrayList<>();
        //Bucle de menú
        do {
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    miem.add(Operaciones.recogerDatosMiembro(c));
                    c++;
                    break;
                case 2:
                    eliminarMiembroPorDni(miem);
                    break;
                case 3:
                    listarMiembros(miem);
                    break;
            }
        } while (opcion != 7);
    }



        private static void menu() {
            //Encabezado
            System.out.println("--------------------");
            System.out.println("Menú de Miembros");
            System.out.println("--------------------");

            System.out.println("Seleccione lo que desea realizar:");
            System.out.println("1: Anhadir miembro");
            System.out.println("2: Eliminar miembro");
            System.out.println("3: Listar miembros");
            System.out.println("4: Mostrar edad media de profesores");
            System.out.println("5: Mostrar nota media de alumnos de ciclo DAM");
            System.out.println("6: Calcular salario medio de profesores");
            System.out.println("7: salir");

        }

        private static void listarMiembros(ArrayList<Miembro> miem) {
            //Listado
            System.out.println("----------------------");
            System.out.println("Miembros comprobados");
            System.out.println("----------------------");
            for (int i = 0; i < miem.size(); i++) {
                System.out.println("DNI: " + miem.get(i).getDni());
                System.out.println("Nombre " + (i + 1) + ": " + miem.get(i).getNombre());
                System.out.println("Edad: " + miem.get(i).getEdad());
                System.out.println("Dirección: " + miem.get(i).getDireccion());
                System.out.println("Fecha Incorporación: " + miem.get(i).getFechaIncorporacion());
                System.out.println("-----------------------------------");
            }
        }
        private static void eliminarMiembroPorDni (ArrayList<Miembro> miem){
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduzca el dni del miembro a eliminar: ");
            String dniEliminar = scan.nextLine();
            for (Miembro miembro : miem) {
                if (miembro.getDni().equals(dniEliminar)) {
                    miem.remove(miembro);
                    System.out.println("Se eliminó el miembro con DNI: " + dniEliminar);
                    break;
                }
            }
        }

    }


