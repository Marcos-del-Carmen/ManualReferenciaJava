package cap3;

public class clase29_testRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder();
        long inicio = System.currentTimeMillis();

        for (int i = 0 ; i <500 ; i++) {
            // va evaluar la concatenacion con el método concat
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 5ms a 6ms
            // c += a + b + "\n"; // 500 => 14ms a 16 ms
            sb.append(a).append(b).append("\n"); // 500  => 0ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c="+c);
        System.out.println("sb.toString() = " + sb.toString());
    }
}
