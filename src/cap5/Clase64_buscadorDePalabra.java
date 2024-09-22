package cap5;

public class Clase64_buscadorDePalabra {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en trigal";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int cantidad  = 0;

        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if(frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }

        if (cantidad == 1) {
            System.out.println("Se encontro " + cantidad + " vez la palabra '" + palabra + "' en la frase");
        } else {
            System.out.println("Se encontro " + cantidad + " veces la palabra '" + palabra + "' en la frase");
        }

    }
}
