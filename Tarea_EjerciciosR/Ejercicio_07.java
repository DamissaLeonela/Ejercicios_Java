package Tarea_EjerciciosR;

import java.util.Scanner;

/*
 * Suma de numeros, Termina con un numero negativo:
 */

public class Ejercicio_07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;       
        int suma = 0;                                  

        System.out.print("Ingrese un número ( < 0 para finalizar): ");
        num = sc.nextInt(); 

        while (num >= 0){                     
            suma = suma + num; 
            System.out.print("Ingrese un número ( < 0 para finalizar): ");                                  
            num = sc.nextInt(); 
        }
        
        System.out.println("La suma es: " + suma ); 
    }  
}
