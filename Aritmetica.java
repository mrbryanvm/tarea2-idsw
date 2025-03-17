public class Aritmetica{

   public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error");
            return 0;
        }
    }  
    public boolean esPrimo(int numero){
        boolean res = false;
        int divisores = 0;
        for(int i = 1; i <= numero; i++){
            if((numero % i) == 0){
                divisores++;
            }
        }
        if(divisores == 2){
            res = true;
        }
        return res;
    }    
}
