
package EstRepetitivas;

import java.util.Scanner;

/**
 * EjerciciosR_02
 */
public class EjerciciosR_02 {

    static Scanner lt=new Scanner(System.in);

    public static void impuestoVehiculo0418() {
        
        //Definir variables
        String cateV="";
        int cantidad=0;
        double costV=0, impUnit=0, impTotal=0, totalImpV=0;
        
        //Datos de Entrada y Salida
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la Cantidad de Vehiculos de Categoria "+(i+1)+": ");
            cantidad=lt.nextInt();
            System.out.println("Ingrese la el Precio de la Categoria "+(i+1)+": ");
            costV=lt.nextInt();
            if(i==1){
                impUnit=costV*0.10;
            }else if(i==2){
                impUnit=costV*0.07;
            }else{
                impUnit=costV*0.05;
            }
            impTotal=impUnit*cantidad;
            System.out.println("Impuesto de Categoria "+(i+1)+" es:"+impUnit);
            System.out.println("Impuesto Total de Categoria "+(i+1)+" es:"+impTotal);
            totalImpV=totalImpV+impTotal;
        }
        System.out.println("Impuesto Total de los Vehiculos es :"+totalImpV);
    }
    public static void main(String[] args) {
        impuestoVehiculo0418();    
    
    }
       
}
   





    
  


