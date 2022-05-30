package Tarea_EjerciciosR;

import java.util.Scanner;

/*
 * Asteriscos:
 */

public class Ejercicio_08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N; 
        int contador = 0;                              
        System.out.print("Ingrese el número de asteriscos: ");
        N = sc.nextInt(); 

        while (contador < N){     

            System.out.print("*");
            contador++;
        } 

        System.out.println();
    }   
}
