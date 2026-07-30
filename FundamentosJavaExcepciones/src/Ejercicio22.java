public class Ejercicio22 {
    public static void main(String[] args) {

    ///Ejercicio 22:  Validar longitud de texto con excepción.

    String texto = "Mano";
    try {
        validarTexto(texto);
        System.out.println("Texto válido.");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }

    public static void validarTexto(String texto) throws Exception {

        if (texto.trim().length() < 5) {
            throw new Exception("El texto debe tener al menos 5 caracteres.");
        }
    }
}
