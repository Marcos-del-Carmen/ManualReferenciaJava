package cap3;

public class clase26_string {
    public static void main(String[] args) {
        String texto1 = "Ejemplo de texto";
        String texto2 =  new String("Ejemplo de Texto");

        boolean esIgual = texto1 == texto2;
        System.out.println("texto1 == texto2 : " + esIgual);

        esIgual = texto1.equalsIgnoreCase(texto2);
        System.out.println("texto1.equalsIgnoreCase(texto2) : " + esIgual);

        String texto3 = "Ejemplo de texto";
        esIgual = texto1 == texto3;
        System.out.println("texto1 == texto3 : " + esIgual);

    }
}
