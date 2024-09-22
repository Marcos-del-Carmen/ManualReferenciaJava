package cap1;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreFactura = "";
        int numProduct = 0;
        double precioProducto = 0, totalBruto = 0, impuesto = 0, totalConImpuesto = 0;

        System.out.println("Ingresa el nombre de la factura");
        nombreFactura = teclado.nextLine();

        System.out.println("¿Cuantos productos son?");
        numProduct = teclado.nextInt();

        for (int i = 1; numProduct >= i ; i++) {
            System.out.println("Ingresa el precio del producto " + i);
            precioProducto = teclado.nextDouble();
            totalBruto = totalBruto + precioProducto;
        }
        impuesto = totalBruto * 0.19;

        totalConImpuesto = totalBruto + impuesto;

        System.out.println("Usted facturo productos de "+ nombreFactura);
        System.out.println("Total bruto es de : $" + totalBruto);
        System.out.println("Porcentaje de IVA 19%");
        System.out.println("El total con IVA incluido es de : $"+totalConImpuesto);
    }
}
