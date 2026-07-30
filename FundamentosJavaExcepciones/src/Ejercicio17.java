import java.util.Scanner;

public class Ejercicio17 {
    
    //Ejercicio 17: Manejar error al acceder a charAt.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre:");
        

        try {
            String nombre = scanner.nextLine();
            System.out.println(nombre.charAt(11));

        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("No se puede obtener.");
            
        }
        scanner.close();
    }
}