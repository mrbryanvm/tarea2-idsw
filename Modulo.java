public class Modulo {
    
    public Modulo(){

    }

    public int modulo(int de, int entre){
        if (entre == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return de % entre;
    }
    
}
