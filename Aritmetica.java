import java.util.Scanner;
public class Aritmetica
{
    public static double sumar(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("MENU DE OPERACIONES");
            System.out.println("Seleccione una operación");
            System.out.println("1. Suma");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                System.out.println("Ingrese el primer número");
                double n1 = sc.nextDouble();
                System.out.println("Ingrese el segundo número");
                double n2 = sc.nextDouble();
                double res = sumar(n1, n2);
                System.out.println("Resultado : " + res);
                    
                    break;
            
                default:
                System.out.println("Opción no válida.");
                    break;
            }
            
        } while (opcion != 0);
        sc.close();
    }
}