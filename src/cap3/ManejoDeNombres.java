package cap3;

import java.util.Scanner;

public class ManejoDeNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[3];

        System.out.println("Ingresa tres nombres de personas");
        for (int i = 0; nombres.length > i; i++) {
            nombres[i] = teclado.nextLine();
        }

        for (int j = 0; nombres.length > j; j++) {
            String nombre = nombres[j];
            int post = nombre.length();

            String letra = String.valueOf(nombre.toUpperCase().charAt(1));
            String ultimasLetras = nombre.substring(post-2,post);
            String codigo = letra.concat(".").concat(ultimasLetras).concat("_");
            System.out.print(codigo);
        }


    }
}
