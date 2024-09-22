package cap4_Operadores;

import java.util.Scanner;

public class clase37_asignacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita un número para hacer ua suma de números");
        System.out.println("Entre 1 hasta el número que ingreses");
        int limite = teclado.nextInt();
        int sumaRango = 0;
        for (int i = 1; limite>i; i++) {
            System.out.print(i + " ");
            sumaRango += i;
        }
        System.out.println("\nsumaRango = " + sumaRango);

        String sqlString = "SELECT * FROM clientes AS c";
        sqlString += "WHERE c.nombre = 'Andres'";
        sqlString += "AND c.activo = 1";
        System.out.println("sqlString = " + sqlString);
        
        int i = -5;
        int j = +i;
        int k = -i;
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
