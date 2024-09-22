package cap8_calendario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Clase79_convertirFecha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato yyyy-MM-dd");
        try {
            Date fecha = formato.parse(teclado.next());
            System.out.println("fecha = " + fecha);
            System.out.println("formato.format(fecha) = " + formato.format(fecha));
        } catch (ParseException e){
            e.printStackTrace();
        }

    }
}
