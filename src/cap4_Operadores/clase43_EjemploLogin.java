package cap4_Operadores;

import java.util.Scanner;

public class clase43_EjemploLogin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] users = {"marcos", "admin", "pedro"};
        String[] passt = {"123", "12345", "1009"};

        System.out.println("Ingresa el username");
        String u = teclado.nextLine();

        System.out.println("Ingresa la contraseña");
        String p = teclado.nextLine();

        boolean esValido = false;

        for (int i = 0; i < users.length; i++ ) {
            esValido = users[i].equals(u) && passt[i].equalsIgnoreCase(p) ? true : esValido;
        }

        String mensaje = esValido ? "Bienvenido ".concat(u) : "Te equivocaste al escribir la contraseña o el usuario";

        System.out.println(mensaje);
    }
}
