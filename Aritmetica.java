public class Aritmetica {

    public Aritmetica(){
        
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error");
            return 0;
        }
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
}
