package cap3;

public class clase31_metodos {
    public static void main(String[] args) {
        String nombre = "Marcos";
        System.out.println("nombre.length() = " + nombre.length()); // se obtiene el largo de la cadena de texto
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // convierte en mayusculas todas las letras de la variable
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // convierte en minusculas todas las letras de la variable
        System.out.println("nombre.equals(\"Marcos\") = " + nombre.equals("Marcos")); // compara entre las cadenas de texto
        System.out.println("nombre.equals(\"marcos\") = " + nombre.equals("marcos"));
        System.out.println("nombre.equalsIgnoreCase(\"marcos\") = " + nombre.equalsIgnoreCase("marcos")); // compara entre las canedas sin tomar en cuenta si son mayusculas o minisculas
        System.out.println("nombre.compareTo(\"Marcos\") = " + nombre.compareTo("Marcos")); // compara ambas candenas y muestra un número

        System.out.println("nombre.charAt(3) = " + nombre.charAt(3)); // obtiene una letra de la cadena de texto
        System.out.println("nombre.substring(2,6) = " + nombre.substring(2,6)); // obtiene las letras de entre el largo que se le ponga

        System.out.println("nombre = " + nombre);

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"-\") = " + trabalenguas.replace("a", "-")); // remplaza una letra por otra dependiendo a los parametros recividos

        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // busca la primera posicion del parametro que se le haya colocado
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // busca la ultima posicion del parametro que se le haya colocado
        // ambos métodos devuelven un número en caso de que no se encuentre manda un valor negativo -1

        System.out.println("trabalenguas.contains(\"guas\") = " + trabalenguas.contains("guas")); // esto nos devuelve un valor booleano en caso de que si lo encuentra manda un true caso contrario false
        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("tra")); // este indica si empieza con lo que se le esta pasando del parametro y devuelve un boleano
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as")); // este indica si termina con lo que se le esta pasando del parametro y devuelve un boleano
        System.out.println(" trabalenguas ".trim()); // este método se quitan los espacios en blanco

    }
}