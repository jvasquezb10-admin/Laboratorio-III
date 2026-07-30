
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        // Ejercicio 24: Reintentar lectura si ocurre error.

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingrese un número entero: ");
                int numero = scanner.nextInt();
                System.out.println("Número ingresado: " + numero);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
