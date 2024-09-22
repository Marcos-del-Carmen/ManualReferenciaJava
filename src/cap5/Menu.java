package cap5;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        char eleccion;

        do {
            System.out.println ("Ayuda para:");
            System.out.println (" 1. if");
            System.out.println (" 2. switch");
            System.out.println (" 3. while");
            System.out.println (" 4. do-while");
            System.out.println (" 5. for\n");
            System.out.println ("Elige una opción:");
            eleccion = (char) System.in.read();
        } while (eleccion < '1' || eleccion > '5');

        System.out.println ("\n");
        switch (eleccion) {
            case '1':
                System.out.println ("La sentencia if:\n");
                System.out.println ("if (condición) sentencia;");
                System.out.println ("else sentencia;");
                break;
            case '2':
                System.out.println ("La sentencia switch:\n");
                System.out.println ("switch (expresion) {");
                System.out.println (" case constante:");
                System.out.println (" conjunto de sentencias");
                System.out.println (" break;");
                System.out.println (" // ...");
                System.out.println ("}");
                break;
            case '3':
                System.out.println ("La sentencia while:\n");
                System.out.println ("while (condición) sentencia;");
                break;
            case '4':
                System.out.println ("La sentencia do-while:\n");
                System.out.println ("do {");
                System.out.println ("sentencia;");
                System.out.println ("} while (condición);");
                break;
            case '5':
                System.out.println ("La sentencia for:\n");
                System.out.print ("for (inicialización; condición; iteración)");
                System.out.println (" sentencia;");
                break;
        }
    }
}
