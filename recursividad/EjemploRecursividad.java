 package recursividad;
 
 public class EjemploRecursividad {

    public static int factorialR(int n) {
        if (n>1) {
            return factorialR(n-1)*n;
        }
        return 1;
    }
    
    public static int fibonaciR(int n) {
        if ( n>1) {
            return fibonaciR(n-1) + fibonaciR(n-2);
        }
        return n;
        
    }
    public static void main(String[] args) {

         System.out.println(factorialR(10));
         System.out.println("fibonaci");
         System.out.println(fibonaciR(6));
        
    }
   
 }