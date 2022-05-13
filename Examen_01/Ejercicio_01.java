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
     
     public static void pEjercicio_02() {

        //Definir variables
        double Precio, Descuento, igv, Total, PrecioFinal;
        
        //Datos de entrada
        System.out.println("Ingrese el precio del artefacto: ");
        Precio = leerTeclado.nextDouble();
        
        //Proceso
        if (Precio>= 2000) {  
            Descuento = Precio * 0.10;
        }else if (Precio>1000 && Precio<2000) {
            Descuento = Precio * 0.05;
        }else if (Precio>=500 && Precio<1000) {
            Descuento = Precio * 0.02;
        }else{
            Descuento =  Precio * 0;
        }
        Total = Precio - Descuento;
        igv = Total * 0.18;
        PrecioFinal = Total + igv;

        //Datos de salida
        System.out.println("El igv es: "+ igv);
        System.out.println("El descuento es : "+ Descuento);
        System.out.println("El monto total a pagar es de: "+ PrecioFinal);
    }


    public static void Ejercicio_4() {
        
        //Definir variables
        double anho;
        String mensaje, genero;

        //Datos de entrada
        System.out.println("Ingrese la cantidad de años: ");
        anho=leerTeclado.nextDouble();
        System.out.println("Ingrese su genero (masculino o femenino): ");
        genero=leerTeclado.next();
        
        //Proceso
        if (anho>=70) {
            mensaje=("Su vacuna es de tipo C");
        }else if (anho>=16 && anho<=69 && genero=="masculino") {
            mensaje=("Su vacuna es de tipo A");
        }else if (anho>=16 && anho<=69 && genero=="femenino") {
            mensaje=("Su vacuna es de tipo B");
        }else{
            mensaje=("vacuna de tipo A");
        }
        //Datos de salida
        System.out.println(mensaje);
        
    }
}



