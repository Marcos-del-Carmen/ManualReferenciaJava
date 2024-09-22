package cap8_calendario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
* @Autor https://gist.github.com/javerosanonimos/3640161f18f8527bcf5088414f10bc91
* Me apoye del siguiente repocitorio aunque lo adapte a como yo lo queria
* */

public class Tarea11_CalcularEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimiento = Calendar.getInstance();

        System.out.println("Vamos a calcular tu edad ingresa tu fecha de nacimiento con el siguiente formato yyyy-MM-dd");

        try {
            System.out.println("¿Cuando naciste?");
            Date fechaNac = formato.parse(teclado.next());
            fechaNacimiento.setTime(fechaNac);

            int anio = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
            int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
            int dia = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNacimiento.get(Calendar.DAY_OF_MONTH);

            System.out.println("Tienes "+ anio +" años ");

            if (mes == 0) {
                System.out.println("Este mes es cuando naciste");
            } else {
                System.out.println("Con mes " + mes);
            }

            System.out.println("Con " + dia + " días");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
