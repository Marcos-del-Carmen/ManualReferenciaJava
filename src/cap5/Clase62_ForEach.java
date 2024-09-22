package cap5;

public class Clase62_ForEach {
    public static void main(String[] args) {
        int numeros [] = {10,11,12,24,36,48,60,72,80};
        int suma = 0;

        for (int x : numeros) {
            System.out.println(x);
            suma += x;
        }

        System.out.println("La suma de los números " + suma);
    }
}
