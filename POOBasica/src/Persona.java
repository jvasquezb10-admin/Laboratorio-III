public class Persona {

    private String nombre;
    private int edad;
    private String dpi;
    private double salario;

    public Persona (){
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDpi() {
        return dpi;
    }

    public double getSalario() {
        return salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad Invalida.");
        }
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarDatos(){
        System.out.println("\nNombre: "+ getNombre());
        System.out.println("Edad: " +getEdad());
        System.out.println("DPI: " +getDpi());
        System.out.println("Salario: " +getSalario());
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Jenner Vasquez");
        persona1.mostrarDatos();
    }
}
