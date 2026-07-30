public class Ejercicio08 {
    public static void main(String[] args) {
        //Manejar excepcion en metodo.

        positivo(-30);

    }

    public static void positivo (int numero){
        try {
            if (numero > 0){
                System.out.println("\nnumero positivo");
            }else{
                throw new Exception("\nEl numero ingresado no es positivo");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
