import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args) {

        //Validar error al convertir un texto a numero

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese un valor: ");
        String texto = scanner.nextLine();
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("valor ingresado en numero: "+ numero);
        } catch (Exception e) {
            System.out.println(e);
        }
        scanner.close();
    }
}
