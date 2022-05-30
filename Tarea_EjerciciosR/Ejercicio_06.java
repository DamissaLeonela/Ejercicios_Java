package Tarea_EjerciciosR;

import java.util.Scanner;

/*
 * Dibujo de un cuadrado formado por dígitos del 0 al 9:
 */

public class Ejercicio_06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int Filas, Columnas, Contador = 0;
    
        do {
           System.out.print("Ingrese el número de filas del cuadrado: ");                                          
           Filas = sc.nextInt();
    
        } while(Filas<2);

        for(int i = 1; i<=Filas; i++) {   
        
            for(int j = 1; j<=Filas; j++){                                                    
               System.out.print(Contador % 10 + " ");
               Contador++;
            } 
            
            System.out.println();
        
        }  
    }
}
