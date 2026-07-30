
public class Ejercicio07 {
    public static void main(String[] args) {
        //Crear método que lance excepción si número es negativo.
        try{
        positivo(-22);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
    }
        public static void positivo (int numero)throws Exception{
            if (numero > 0){
                System.out.println("\nNumero positivo");
            } else {
                throw new Exception("El numero ingresado no es positivo");
            }
    }
}

