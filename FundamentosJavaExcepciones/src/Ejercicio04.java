import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Mostrar mensaje personalizado en excepcion.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor Ingrese un numero entero");
        try {
            int numero = scanner.nextInt();
            System.out.println("El entero ingresado fue: "+ numero);

        } catch (Exception e) {
            System.out.println("\n" + "El valor ingresado no fue un entero. Intente nuevamente. ");
        }
        scanner.close();
    }
}
