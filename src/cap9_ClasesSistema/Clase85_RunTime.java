package cap9_ClasesSistema;

import java.io.IOException;

public class Clase85_RunTime {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso = rt.exec("notepad");
            } else  if(System.getProperty("os.name").toLowerCase().startsWith("mac")){
                proceso = rt.exec("textedit");
            } else  if(System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("El comando es desconocido = " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
