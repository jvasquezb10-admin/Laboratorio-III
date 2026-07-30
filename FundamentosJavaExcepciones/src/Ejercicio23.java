import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        //Ejercicio 24: Controlar error en entrada de usuario.

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número entero.");
        } finally {
            scanner.close();
        }
    }
}
