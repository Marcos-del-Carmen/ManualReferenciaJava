package cap4_Operadores;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String mayor = "";

        System.out.println("Ingresa un número");
        num1 = teclado.nextInt();
        System.out.println("Ingresa otro número");
        num2 = teclado.nextInt();

        mayor = num1 > num2 ? num1 + ", " + num2 : num2 + ", " + num1;

        System.out.println("numeros ordenados " + mayor);
    }
}
