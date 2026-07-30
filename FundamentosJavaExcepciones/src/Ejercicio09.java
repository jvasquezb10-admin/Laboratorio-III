import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese su edad (años): ");

        try {
            int edad = scanner.nextInt();
            if(edad >= 0){
                System.out.println("Su edad en años es: "+ edad);
            }else{
                throw new Exception("La edad no puede ser negativa");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
