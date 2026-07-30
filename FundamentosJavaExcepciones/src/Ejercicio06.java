import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {

        //Pedir número y validar que sea positivo (con excepción).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        
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
