package cap9_ClasesSistema;

import java.util.Properties;

public class Clase81_PropiedadesSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String userhome = System.getProperty("user.home");
        System.out.println("userhome = " + userhome);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeperator = System.getProperty("line.separator");
        String lineSeperator2 = System.lineSeparator();

        System.out.println("lineSeperator : " + lineSeperator2 + "Una linea de espacio...");
        Properties p = System.getProperties();
        p.list(System.out);

    }
}
