
import java.util.Scanner;
public class Ejercicio19 {

    //Validar número mayor a 100.

    public static void main(String[] args) {
        

        //Pedir número y validar que sea positivo (con excepción).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        
        try {
            int numero = scanner.nextInt();
            if (numero > 100){
                System.out.println("Numero mayor a 100");
            } else {
                throw new Exception("El numero ingresado no es mayor a 100");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            scanner.close();
        }
    }
}
