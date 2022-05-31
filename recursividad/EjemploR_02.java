package recursividad;

public class EjemploR_02 {

    public static double potencia (int base, int exponente) {

        if (exponente == 0) {
            return 1;
        } else if (exponente ==1) {
            return base;
        } else if (exponente < 0) {
            return potencia (base,exponente + 1)/ base;
        } else {
            return base * potencia (base, exponente - 1);
        }       
    }   
    
    public static void main(String[] args) {

        System.out.println("potencia");
         System.out.println(potencia(2, 3));
         
    }   
}
