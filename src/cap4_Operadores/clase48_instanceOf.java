package cap4_Operadores;

public class clase48_instanceOf {
    public static void main(String[] args) {
        Object texto = new String ("Creando un objeto de la clase String... ");
        Object num = 7;
        Object decimal = 10.1;
        Number real = 18.1f;
        Integer num2 = Integer.valueOf("10");
        Integer num3 = Integer.valueOf("10");

        System.out.println("num2 = " + (num2 + num3));

        Boolean b1 =  texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 =  texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = real instanceof Float;
        System.out.println("real es del tipo Float = " + b1);

        b1 = num instanceof String;
        System.out.println("num es del tipo String = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);



    }
}
