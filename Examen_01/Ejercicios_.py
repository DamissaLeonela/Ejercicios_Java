def Ejercicio_01():
    #Definir variables
    examen : float()
    entrevista : float()
    test : float()











import java.util.Scanner;

/**
 * Examen_01
 */
public class Ejercicio_01 {

    static Scanner leerTeclado=new Scanner(System.in);

    public static void Ejercicio_01() {
        
        //Definir variables
        double examen, entrevista, test, promedio;
        String estado;
        
        //Datos de entrada
        System.out.println("Ingrese la nota del examen de conocimiento: ");
        examen = leerTeclado.nextDouble();
        System.out.println("Ingrese la nota de la entrevista personal: ");
        entrevista = leerTeclado.nextDouble();
        System.out.println("Ingrese la nota del test psicologico:");
        test = leerTeclado.nextDouble();
        
        //Proceso
        promedio = examen*0.40+entrevista*0.35+test*0.25;
        /* >=17 y <=20 Obtuvo la vacante, su nivel es 4; <17 y >14 Obtuvo la vacante, su nivel es 3
        <=14 y >=11 Obtuvo la vacante, su nivel es 2; <11 No tiene vacante, su nivel es 1
        */
        if (promedio>=17 && promedio<=20) {
            estado ="\n\n Aprobo \n\t Obtuvo la vacante";
        }else if(promedio<17 && promedio>14){
            estado ="\n\n Aprobo \n\t Obtuvo la vacante";
        }else if(promedio<=14 && promedio>=11){
            estado ="\n\n Aprobo \n\t Obtuvo la vacante con nivel baja";
        }else{
            estado ="\n\n Desaprobo";
        }

        // Datos de Salida 
        System.out.println(estado);
    }
    
}