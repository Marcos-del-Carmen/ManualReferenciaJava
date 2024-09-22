package cap5;

import javax.swing.*;

public class Clase60_existeElNombre {
    public static void main(String[] args) {
        String[] nombres = {"Kenia", "Marcos", "Denisse", "Paola", "Hannia", "Francisco", "Saul"};
        int cont = nombres.length;

        String buscar = JOptionPane.showInputDialog("Busca un nombre por ejemplo \"Kenia\", \"Denisse\" ");
        boolean encontrado = false;

        for (int i = 0; i < cont; i++) {
            if(buscar.equalsIgnoreCase(nombres[i])) {
                encontrado = true;
            }
        }

        if(encontrado) {
            JOptionPane.showMessageDialog(null,"El nombre " + buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null,"El nombre " + buscar + " no fue encontrado");
        }
    }
}
