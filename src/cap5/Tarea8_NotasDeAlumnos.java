package cap5;

import java.util.Scanner;

public class Tarea8_NotasDeAlumnos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;
        double promedio = 0;

        int notasMayor5 = 0;
        int notasMenor4 = 0;
        int notasCon1 = 0;

        int maxNotas = notas.length;

        boolean bandera = false;

        System.out.println("7 : Exelente");
        System.out.println("5 : Pasable");
        System.out.println("4 : Nesecita estudiar");
        System.out.println("1 : Clases de regularisación \n");

        System.out.println("Ingresa las calificaciones de los "+maxNotas+" alumnos");


        for(int i = 0; i< maxNotas; i++) {
            System.out.print("> ");
            notas[i] = teclado.nextDouble();
            suma = suma + notas[i];

            if (notas[i]>5) {
                notasMayor5++;
            }

            if (notas[i]<4) {
                notasMenor4++;
            }

            if (notas[i]==1) {
                notasCon1++;
            }

            if (notas[i]==0) {
                bandera = true;
                break;
            }
        }

        if(!bandera) {
            promedio = suma / maxNotas;
            System.out.println(" _________________________________ _____ ");
            System.out.println("| Alumnos con nota de mayor de 5  | " + notasMayor5 + " ");
            System.out.println("| Alumnos con nota de menor de 4  | " + notasMenor4+ " ");
            System.out.println("| Alumnos con nota igual a 1      | " + notasCon1+ " ");
            System.out.println("| Promedio grupal                 | " + promedio+ "  ");
            System.out.println(" --------------------------------- ----- ");
        } else {
            System.out.println("¡¡Error el programa se finalizo!!");
        }


    }
}
