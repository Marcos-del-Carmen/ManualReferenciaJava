package cap5;

public class Clase63_etiquetasForWhile {
    public static void main(String[] args) {
        etiqueta:
        for (int i = 1; i <= 5; i++) {
            int j = 1;
            while(j <= 5) {
                if(i == 2) {
                    continue etiqueta;
                }
                j++;
                System.out.print("[i = " + i + ", j = " + j +"] ");
            }
            System.out.println();
        }
    }
}
