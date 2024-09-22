package cap4_Operadores;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String[] nombres = new String[3];

        for(int i = 0; i < nombres.length; i++){
            nombres[i] = JOptionPane.showInputDialog( (i+1) + " nombre");
        }

        String max = nombres[0];
        for (int j = 0; j < nombres.length; j++) {
            if(nombres[j].length() > max.length() ) {
                max = nombres[j];
            }
        }

        JOptionPane.showMessageDialog(null,"El nombre más largo es " + max);
    }
}
