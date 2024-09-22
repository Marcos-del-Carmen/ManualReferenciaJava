package cap4_Operadores;

import java.awt.desktop.AboutEvent;

public class clase40_Relacionales {
    public static void main(String[] args) {
        int a = 3;
        byte b = 7;
        float c = 127e-7f;
        double d = 3.1416;
        boolean e = false;

        boolean b1 = a == b;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = a != b;
        System.out.println("b3 = " + b3);

        boolean b4 = e == true;
        System.out.println("b4 = " + b4);

        boolean b5 = e != true;
        System.out.println("b5 = " + b5);

        boolean b6 = a > b;
        System.out.println("b6 = " + b6);
        
        boolean b7 = a < b;
        System.out.println("b7 = " + b7);

        boolean b8 = c >= d;
        System.out.println("b8 = " + b8);
        
        boolean b9 = c <= d;
        System.out.println("b9 = " + b9);
        
        boolean b10 = true || false && false || false;
        System.out.println("b10 = " + b10);
        
    }
}
