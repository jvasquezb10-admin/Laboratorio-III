import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Validar contraseña minima
        String acceso = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor cree su contraseña: ");
        while (true){
            try {
                String contraseña = scanner.nextLine();

                if (contraseña.length() < 13) {
                    throw new Exception("Su contraseña debe contener al meos 13 caracteres");
                }else if(!contraseña.matches(".*[A-Z].*")){
                    throw new Exception("Su contraseña debe contener al menos una mayuscula");
                }else if(!contraseña.matches(".*[!@#$%^&*].*")){
                    throw new Exception("su contraseña debe contener almenos un caracter especial ej. !@#$%^&*");
                }else if(!contraseña.matches(".*[0-9].*")){
                    throw new Exception("Su contraseña debe conter al menos un numero");
                }else{
                    System.out.println("La contraseña a cumplido con todos los requerimientos");
                    System.out.println("guardando...");
                    acceso = contraseña;
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
