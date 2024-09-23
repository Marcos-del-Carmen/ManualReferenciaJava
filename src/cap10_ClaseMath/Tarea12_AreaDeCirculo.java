package cap10_ClaseMath;

import javax.swing.*;

public class Tarea12_AreaDeCirculo {
    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un radio para calcular el área de un circulo"));
        double area = Math.PI * Math.pow(radio,2);
        JOptionPane.showMessageDialog(null, "El radio es "+ radio + " y su área es de " + area);
    }
}
