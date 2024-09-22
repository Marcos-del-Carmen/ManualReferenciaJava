package cap6_wrapper;

public class Clase71_WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("Coparando dos objetos boolena: " + (objBoolean == objBoolean2));
        System.out.println("Coparando dos objetos boolena: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Coparando dos objetos boolena: " + (objBoolean == objBoolean3));
    }
}
