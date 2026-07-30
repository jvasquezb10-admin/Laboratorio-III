public class Ejercicio01 {
    public static void main(String[] args) throws Exception {
        //Capturar excepcion al divir entre 0
        int a = 10;
        int b = 0;

        try {
            int division = a/b;
            System.out.println("El resultado de la division es "+ division);
        } catch (Exception e) {
            System.out.println("\n"+ e);
        }
    }
}
