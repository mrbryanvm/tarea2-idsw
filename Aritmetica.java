public class Aritmetica {
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int resultado = multiplicar(a, b);
        
        System.out.println(a + " * " + b + " = " + resultado);
    }
}
