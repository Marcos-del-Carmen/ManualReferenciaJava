package cap10_ClaseMath;

import java.util.Random;

public class Clase88_random {
    public static void main(String[] args) {
        String[] colores = {"azul", "verde", "negro", "blanco", "rojo", "marron", "cafe"};

        double random = Math.random();


        random *= colores.length;
        random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random();
        int numRandom = randomObj.nextInt();
        System.out.println("numRandom = " + numRandom);

        numRandom = randomObj.nextInt(colores.length);
        System.out.println("colores = " + colores[numRandom]);
    }
}
