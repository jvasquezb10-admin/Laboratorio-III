import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Validar entrada numerica con try catch.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor Ingrese un numero entero");
        try {
            int numero = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("\n"+ e);
        }
    }
}
