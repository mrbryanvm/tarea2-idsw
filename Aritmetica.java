public class Aritmetica{

   public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error");
            return 0;
        }
    }

    public static double potencia(double base, int exponente){
        return Math.pow(base, exponente);
    }
}
