import java.util.Scanner;

public class Ejercicio21 {
      //Ejercicio 21: Crear método que valide email simple.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un correo electrónico: ");
        String email = scanner.nextLine();

        try {
            validarEmail(email);
            System.out.println("Correo electrónico válido.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validarEmail(String email) throws Exception {
        if (email.trim().isEmpty()) {
            throw new Exception("El correo no puede estar vacío.");
        }
        if (!email.contains("@")) {
            throw new Exception("El correo debe contener '@'.");
        }
        if (!email.contains(".com")) {
            throw new Exception("El correo debe contener '.com' .");
        }
    }

}
