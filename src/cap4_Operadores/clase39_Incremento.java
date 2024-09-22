package cap4_Operadores;

public class clase39_Incremento {
    public static void main(String[] args) {
        int i  = 1;
        int j = ++i;
        System.out.println("Incremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 2;
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("Decremento");
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 4;
        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);



    }
}
