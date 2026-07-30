import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //Ejercicio 13: Usar throw manualmente.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Validemos si un numero es positivo, Por favor ingrese un numero: ");
        
        try {
            int numero = scanner.nextInt();
            if (numero > 0){
                System.out.println("Numero positivo");
            } else {
                throw new Exception("El numero ingresado no es positivo");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            scanner.close();
        }
    }
}
