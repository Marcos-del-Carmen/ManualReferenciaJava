package cap5;

public class BreakAusente {
    public static void main(String[] args) {
        String estacion ="";
        int intMes = 1;
        switch (intMes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "irreconosible";
                break;
        }
        System.out.println("La estación del año es " + estacion);
    }
}
