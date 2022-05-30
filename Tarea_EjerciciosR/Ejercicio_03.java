package Tarea_EjerciciosR;

import java.util.Scanner;

/*
 * Nombre en Viceversa:
 */


public class Ejercicio_03 {

    public static void main(String[] args) {

        Scanner lt = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = lt.next();
        
        for (int i = nombre.length()-1; i >= 0; i--) {
            System.out.println(nombre.charAt(i));
        }
    } 
}
