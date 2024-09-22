package cap4_Operadores;

import java.util.Scanner;

public class clase47_NumeroMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int max = 0;
        System.out.println("Ingrese el primer número ");
        int n1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número");
        int n2 = teclado.nextInt();

        System.out.println("Ingrese el tercer número");
        int n3 = teclado.nextInt();

        max = (n1 > n2) ? n1 : n2;
        max = (max > n3) ? max : n3;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("max = " + max);
    }
}
