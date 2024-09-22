package cap3;

public class clase27_concatenacion {
    public static void main(String[] args) {
        String curso = "Programación en java";
        String profesor = "Marcos Del Carmen ";

        String detalle1 = curso + " con el profesor " +profesor;
        System.out.println(detalle1);

        int num1 = 10;
        int num2 = 5;
        System.out.println(detalle1 + num1 + num2);
        System.out.println(detalle1 + (num1 + num2)); // presedencia de los operadores
        System.out.println(num1 + num2 + detalle1);

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println(detalle2);
    }
}
