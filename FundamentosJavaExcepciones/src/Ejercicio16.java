import java.util.Scanner;
public class Ejercicio16 {

    // validar que texto no este vacio

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEscriba la frase del dia. ");

        try {
        String nombre = scanner.nextLine();
            if( nombre.trim().isEmpty()){
                throw new Exception("El texto no puede estar vacio. ");
            } else{
                System.out.println("\nUsted es muy sabio. ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
