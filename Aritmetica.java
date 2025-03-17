public class Aritmetica {

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error");
            return 0;
        }
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
}
