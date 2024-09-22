package cap6_wrapper;

import java.lang.reflect.Method;

public class Clase72_metodoClase {
    public static void main(String[] args) {
        int num1 = 10;
        Integer num2 = 12;

        String texto = "Hola que tal!";
        Class strClass = texto.getClass();

        for(Method method: strClass.getMethods()){

        }
    }
}
