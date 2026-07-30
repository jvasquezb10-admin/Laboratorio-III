public class Ejercicio20 {
    //Simular error controlado con throw


    public static void main(String[] args) {
        try {

        throw new Exception("\nEste es un error simulado.");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

}
