package cap5;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Tarea9_Menu {
    public static void main(String[] args) {
        int opcionIndice = 0;
        do {
            Map<String, Integer> opciones = new HashMap();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario elimino correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agrego correctamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Se listarón los usuarios correctamente");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "¡Gracias por usar nuestro programa!");
                        break;
                }
                // aca un if o switch para las distintas opciones.
            }
        } while(opcionIndice!=5);
    }
}
