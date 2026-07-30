import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        //Leer arreglo y capturar índice fuera de rango.
        Scanner scanner = new Scanner(System.in);
        int [] numeros = {10,20,30,40,50};
        
        try {
            System.out.println("\nIngrese la poscicion del arreglo que desea mostrar 0-4");
            int posicion = scanner.nextInt();

            System.out.println(numeros[posicion]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera del arreglo.");
        }finally{
            scanner.close();
        }
    }
}
