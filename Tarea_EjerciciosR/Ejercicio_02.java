package Tarea_EjerciciosR;

import java.util.Scanner;

/*
 * Nombre en Vertical:
 */

public class Ejercicio_02 {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = lt.next();
        
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
    }
}

