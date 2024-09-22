package cap3;

public class clase33_obtenerExtension {
    public static void main(String[] args) {
        String archivo = "nombre_archivo.html";
        int extension = archivo.lastIndexOf(".")+1;

        System.out.println("extension = " + archivo.substring(extension));
        String trabalenguas = "trabalenguas";

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i] + "-");
        }
        System.out.println("");
        String palabras = "Teclado,Monitor,Computadora,Ratón,Lampara";
        String[] arreglo1 = palabras.split(","); // con este método se tiene un serparador es decir que por cada letra "a"
        // pasa a ser otro objeto del arreglo.
        int cadena = arreglo1.length;

        for(int j=0; j<cadena; j++) {
            System.out.println(arreglo1[j]);
        }
    }
}
