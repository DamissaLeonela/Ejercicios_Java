package Examen_01;

import java.util.Scanner;

/**
 * Ejercicios
 */
public class Examen_01 {
    static Scanner leerTeclado=new Scanner(System.in);
       
    public static void Ejercicio_01() { 

       //Definir variables
       double Examen, Entrevista, Test, Promedio;
       String Estado;

       //Datos de entrada
       System.out.println("Ingrese la nota de el examen de conocimientos: ");
       Examen = leerTeclado.nextDouble();
       System.out.println("Ingrese la nota de la entrevista personal: ");
       Entrevista = leerTeclado.nextDouble();
       System.out.println("Ingrese la nota del test psicologico: ");
       Test = leerTeclado.nextDouble();
    
       //Proceso
       Promedio = Examen*0.40 + Entrevista*0.35 + Test*0.25;
       /* >=17 y <=20 Obtuvo la vacante, su nivel es 4; <17 y >14 Obtuvo la vacante, su nivel es 3
       <=14 y >=11 Obtuvo la vacante, su nivel es 2; <11 No tiene vacante, su nivel es 1
       */
       if (Promedio>=17 && Promedio<=20) {
            Estado = "\n\n Aprobo \n\t Obtuvo la vacante, su nivel es 4";
       }else if (Promedio<17 && Promedio>=14) {
            Estado = "\n\n Aprobo \n\t Obtuvo la vacante, su nivel es 3";
       }else if (Promedio<=14 && Promedio>=11) {
            Estado = "\n\n Aprobo \n\t Obtuvo la vacante con nivel baja, su nivel es 2";
       }else if (Promedio<11) {
            Estado = "\n\n Desaprobo, su nivel es 1";
       }
         
       //Datos de salida
       System.out.println(Estado);

    }
}


