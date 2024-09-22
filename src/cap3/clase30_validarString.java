package cap3;

public class clase30_validarString {
    public static void main(String[] args) {
        String curso=null;
        //boolean esNulo = curso == null;
        // System.out.println("esNulo = " + esNulo);
        if(!(curso == null)) {
            if(!(curso.length() == 0) || curso.isEmpty()) {
                if(!(curso.isBlank())){
                    System.out.println("Bienvenido al ".concat(curso));
                    System.out.println(curso.toUpperCase());
                } else {
                    System.out.println("La variable curso esta en blanco");
                }
            } else {
                System.out.println("La variable curso no tiene nada");
            }
        } else {
            System.out.println("La variable curso es null");
        }

    }
}
