package cap8_calendario;

import javax.xml.crypto.dsig.SignatureMethod;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Clase78_Calendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // Objetos y declaraciones en la fecha
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, 8);
        calendario.set(Calendar.DAY_OF_MONTH, 16);

        // Objetos y declaraciones para la hora
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);
    }
}
