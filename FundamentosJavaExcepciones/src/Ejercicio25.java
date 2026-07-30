import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio25 {

     // Ejercicio 25: Crear pequeño menú con manejo de errores.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("|||| MENÚ ||||");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola!");
                    break;
                case 2:
                    System.out.println("¡Hasta luego!");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    throw new Exception("Opción no válida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
