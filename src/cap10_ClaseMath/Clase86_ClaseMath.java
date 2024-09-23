package cap10_ClaseMath;

public class Clase86_ClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-10);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(9);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.2, 1.3);
        System.out.println("max = " + max);

        double min = Math.min(3.2, 1.3);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(5.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(9.6);
        System.out.println("entero = " + entero);

        // TRIGONOMETRÌA
        System.out.println("METODOS DE LA CLASE MATH SOBRE TRIGONOMETRÌA");

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(25);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("Math.sin(radianes)"+Math.sin(radianes));
        System.out.println("Math.cos(radianes)"+Math.cos(radianes));

        // METODO RAMDOM DE LA CLASE MATH
    }
}
