package cap8_calendario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Clase80_comparacionFechas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato yyyy-MM-dd");
        try {
            Date fecha = formato.parse(teclado.next());
            Date fecha2 = new Date();
            System.out.println("fecha = " + fecha);
            System.out.println("fecha2 = " + fecha2);
            System.out.println("formato.format(fecha) = " + formato.format(fecha));


            if (fecha.after(fecha2)) {
                System.out.println("La fecha ingresada es mayor a la fecha actual");
            } else if(fecha.equals(fecha2)) {
                System.out.println("Las fechas son iguales");
            } else {
                System.out.println("La fecha ingresada es menor a la fecha actual");
            }
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
