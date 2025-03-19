import java.util.Scanner;

public class Aritmetica {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error");
            return 0;
        }
    }

    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Zeballos Arancibia Dennis Edson
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

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public int binarioDecimal(String bin) {
        int res = 0;
        for (int i = 0; i < bin.length(); i++) {
            int bit = (bin.charAt(i) == '1') ? 1 : 0;
            res = res * 2 + bit;
        }
        return res;
    }

    public String numBinario(int num) {
        if (num <= 1) {
            return Integer.toString(num);
        } else {
            return numBinario(num / 2) + (num % 2);
        }
    }

    public double promedio(int a, int b) {
        return (a + b) / 2.0;
    }

    public int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Aritmetica arit = new Aritmetica();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Potencia");
            System.out.println("8. Binario a Decimal");
            System.out.println("9. Decimal a Binario");
            System.out.println("10. Promedio");
            System.out.println("11. Factorial");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double s1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double s2 = sc.nextDouble();
                    System.out.println("Resultado: " + sumar(s1, s2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    double r1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double r2 = sc.nextDouble();
                    System.out.println("Resultado: " + arit.resta(r1, r2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    double m1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double m2 = sc.nextDouble();
                    System.out.println("Resultado: " + arit.multiplicar(m1, m2));
                    break;
                case 4:
                    System.out.print("Ingrese el dividendo: ");
                    double d1 = sc.nextDouble();
                    System.out.print("Ingrese el divisor: ");
                    double d2 = sc.nextDouble();
                    System.out.println("Resultado: " + arit.division(d1, d2));
                    break;
                    
                // Zeballos Arancibia Dennis Edson
                case 5:
                    System.out.print("Ingrese el primer número (entero): ");
                    int mod1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número (entero): ");
                    int mod2 = sc.nextInt();
                    System.out.println("Resultado: " + arit.modulo(mod1, mod2));
                    break;
                case 6:
                    System.out.print("Ingrese un número: ");
                    double raiz = sc.nextDouble();
                    System.out.println("Resultado: " + arit.raizCuadrada(raiz));
                    break;
                case 7:
                    System.out.print("Ingrese la base: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    int exp = sc.nextInt();
                    System.out.println("Resultado: " + potencia(base, exp));
                    break;
                case 8:
                    System.out.print("Ingrese un número binario: ");
                    sc.nextLine(); // Limpiar buffer
                    String bin = sc.nextLine();
                    System.out.println("Decimal: " + arit.binarioDecimal(bin));
                    break;
                case 9:
                    System.out.print("Ingrese un número entero: ");
                    int num = sc.nextInt();
                    System.out.println("Binario: " + arit.numBinario(num));
                    break;
                case 10:
                    System.out.print("Ingrese el primer número: ");
                    int p1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int p2 = sc.nextInt();
                    System.out.println("Promedio: " + arit.promedio(p1, p2));
                    break;
                case 11:
                    System.out.print("Ingrese un número: ");
                    int fac = sc.nextInt();
                    System.out.println("Factorial: " + arit.factorial(fac));
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
        sc.close();
    }
}
