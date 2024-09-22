package cap4_Operadores;

import java.util.Scanner;

public class EstadoDeGasolina {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double litrosEnTanque = 0;
        String estado = "";

        System.out.println("¿Cual son los litros que tienes en tanque?");
        litrosEnTanque = teclado.nextDouble();
        System.out.println(litrosEnTanque);


        if (litrosEnTanque >= 1 && litrosEnTanque <= 20) {
            estado = "Insuficiente";
        } else if (litrosEnTanque >= 20 && litrosEnTanque <=  35) {
            estado = "Suficiente";
        } else if (litrosEnTanque >= 35 &&  litrosEnTanque <= 40) {
            estado = "Medio estanque";
        } else if (litrosEnTanque >= 40 &&  litrosEnTanque <= 60) {
            estado = "Estanque 3/4";
        } else if (litrosEnTanque >= 60 &&  litrosEnTanque < 70) {
            estado = "Estanque casi lleno";
        } else if (litrosEnTanque == 70) {
            estado = "Estanque lleno";
        }

        System.out.println(estado);

    }
}
