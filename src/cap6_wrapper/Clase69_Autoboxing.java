package cap6_wrapper;

public class Clase69_Autoboxing {
    public static void main(String[] args) {
        Integer[] objInteger = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int suma = 0;
        for(Integer i : objInteger) {
           if(i.intValue() % 2 == 0) {
               suma = suma + i.intValue();
           }
        }
        System.out.println("suma = " + suma);
    }
}
