package cap3;

import com.sun.tools.jconsole.JConsoleContext;

public class clase28_imputabilidad {
    public static void main(String[] args) {
        String curso = "Programación en java";
        String profesor = " Marcos Del Carmen ";

        String resultado = curso.concat(profesor);
        System.out.println("Curso : " + curso);
        System.out.println("Resultado : " + resultado);
        System.out.println(curso == resultado);

        String resuldado2 = curso.transform(c -> {
           return  c + "con" + profesor;
        });

        System.out.println(resuldado2);
        String resultado3 = resultado.replace("a", "A");
        System.out.println(resultado3);
    }
}
