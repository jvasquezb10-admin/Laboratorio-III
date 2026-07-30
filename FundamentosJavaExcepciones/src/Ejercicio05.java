import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        //Usar finally para mostrar mensaje final.

        Scanner scanner = new Scanner(System.in);
        int intento = 0;

        System.out.println("Por favor Ingrese un numero entero, solo tiene 3 intentos");
        while (intento < 3){
            try {
                int numero = scanner.nextInt();
                System.out.println("\nEl entero ingresado fue: "+ numero);
                break;

            } catch (Exception e) {
                System.out.println("\n" + "El valor ingresado no fue un entero. ");
                scanner.nextLine();
            } finally{
                intento = intento + 1;
                System.out.println("Intentos usados: " + intento + "\n");
            }
        }
        scanner.close();
    }
}

