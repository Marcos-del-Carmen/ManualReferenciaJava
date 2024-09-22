package cap4_Operadores;

import java.util.Scanner;

public class clase45_ternario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String variable  = 7 == 5 ? "Si es verdadero " : "Claro que no";
        System.out.println("variable = " + variable);

        String estado = "";
        double mat1 = 0.0;
        double mat2 = 0.0;
        double mat3 = 0.0;

        System.out.println("Ingresa la nota de matematicas");
        mat1 = teclado.nextDouble();

        System.out.println("Ingresa la nota de ciencias");
        mat2 = teclado.nextDouble();

        System.out.println("Ingresa la nota de fisica");
        mat3 = teclado.nextDouble();

        double promedio = (mat1 + mat2 + mat3) / 3;

        estado  = promedio >= 5.49 ? "Aprovado" : "Rechazado";
        System.out.println("Promedio del alumno " + promedio);
        System.out.println("El alumno esta " + estado);
    }
}
