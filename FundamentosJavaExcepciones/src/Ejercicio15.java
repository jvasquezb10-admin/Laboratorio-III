import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
       //Ejercicio 15: Lanzar Excepcion personalizada

        Scanner scanner = new Scanner(System.in);
        System.out.println("Validemos si un numero es positivo, Por favor ingrese un numero: ");
        
        try {
            int numero = scanner.nextInt();
            if (numero < 0){
                throw new Ejercicio14ExcepcionPersonalizada("El numero no puede ser negativo");
            }

            System.out.println("Numero valido: "+ numero);
        } catch (Ejercicio14ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        } finally{
            scanner.close();
        }
    }

}
