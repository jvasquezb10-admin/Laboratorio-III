import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio12 {
    public static void main(String[] args) {
        //Ejercicio 12: Manejar múltiples excepciones (Multy Catch)

        Scanner scanner = new Scanner(System.in);
        int [] numeros = {10,20,30,40,50};
        
        try {
            System.out.println("\nIngrese la poscicion del arreglo que desea mostrar 0-4");
            int posicion = scanner.nextInt();

            System.out.println(numeros[posicion]);
            
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Valor no valido.");
        }finally{
            scanner.close();
        }
    }
}
