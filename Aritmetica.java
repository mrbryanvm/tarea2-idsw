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

    public int modulo(int de, int entre) {
        if (entre == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return de % entre;
    }

    public double raizCuadrada(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return -1; 
        }
    }

    public double resta(double num1, double num2){
        double res = num1 - num2;
        return res;
    }
    
    public int binarioDecimal(String bin){
        int res = 0;
        for(int i = 0;i< bin.length();i++){
            int bit;
            if (bin.charAt(i)=='1') {
                bit = 1;
            }else{
                bit = 0;
            }
            res =  res * 2 + bit;
        }
        return res;
    }

    public String numBinario(int num ){
        String res = "";
        if(num <= 1){
            res = res +num;
        }else{
            res = res + numBinario(num/2) +(num % 2);
        }
        return res;
    }

    public double promedio(int a, int b){
        int suma = a+b;
        double prom = suma/2;
        return prom;
    }
}
