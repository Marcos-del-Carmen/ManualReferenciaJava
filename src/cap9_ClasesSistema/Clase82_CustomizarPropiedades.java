package cap9_ClasesSistema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Clase82_CustomizarPropiedades {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/cap9_ClasesSistema/config.properties");


            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","mi objeto guardado en el objeto properties");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.setProperty(...) = " + ps.setProperty("mi.propiedad.personalizada", "mi objeto guardado en el objeto properties"));
            // System.getProperties().list(System.out);
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.puerto.email"));

        } catch (Exception e){
            System.out.println("No se encontro la ruta "+e);
        }

    }
}
