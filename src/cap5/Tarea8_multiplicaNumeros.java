package cap5;

import java.util.Scanner;

public class Tarea8_multiplicaNumeros {
    public static void main(String[] args) {
    /*
    * Para este ejemplo senti que perdi mucho tiempo y no me di bien a una idea clara de lo que como
    * el multiplicador hacerlo que se reste o bueno se podria empezar con ciclo que empieze con el num2 y llegue hasta -1
    *
    * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);
    }
}
