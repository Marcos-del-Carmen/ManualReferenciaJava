package cap9_ClasesSistema;

import java.util.Map;

public class Clase83_VariablesAmbiente {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);
        System.out.println("-------LISTADO DE VARIABLES DE ENTORNO DEL SISTEMA -------");
        for(String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        String username = System.getProperty("USERNAME");
        System.out.println("username = " + username);

        String java_home = System.getProperty("JAVA_HOME");
        System.out.println("java_home = " + java_home);

        String temDir = System.getProperty("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

    }
}
