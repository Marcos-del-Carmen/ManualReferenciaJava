package cap8_calendario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clase76_calendario {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("Fecha = "+fecha);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy");
        String fechaStr = sdf.format(fecha);

        System.out.println(fechaStr);
    }
}
