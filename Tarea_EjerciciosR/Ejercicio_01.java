package Tarea_EjerciciosR;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int A, B;

        do {
            System.out.print("Ingrese un número entero: ");
            A = sc.nextInt();
            System.out.print("Ingrese otro número entero mayor que el anterior: ");
            B = sc.nextInt();
            if (A >= B) {
                System.out.println("El segundo número debe ser mayor que el primero");                  
            }
        } while (A >= B);

        System.out.println("Numeros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }  
}
