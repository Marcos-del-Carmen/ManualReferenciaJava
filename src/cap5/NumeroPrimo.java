package cap5;

public class NumeroPrimo {
    public static void main (String args[]) {
        int num;
        boolean esPrimo = true;
        num = 19;
        for (int i=2; i <= num/i; i++) {
            if ((num % i) == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) System.out.println ("El número es primo");
        else System.out.println ("El número no es primo");
    }
}
