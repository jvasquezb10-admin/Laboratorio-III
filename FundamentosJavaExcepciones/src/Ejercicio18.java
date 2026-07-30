public class Ejercicio18 {
    //Ejercicio 18: Validar División segura con método.

    public static void main(String[] args) {
        try {
        double resultado = dividir(10, 0);
        System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double dividir (double dividendo, double divisor)throws ArithmeticException{

        if(divisor == 0){
            throw new ArithmeticException("No se puede dividir un numero entre 0");
        }
            return (dividendo / divisor);
    }
}
