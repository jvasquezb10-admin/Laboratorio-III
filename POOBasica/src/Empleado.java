public class Empleado {
    private double salario;
    private String nombre;
    private String departamento;

    public Empleado(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            throw new IllegalArgumentException("\nEl empleado debe devengar un salario positivo");
        }
        this.salario = salario;
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jenner Vasquez", "RRHH");
        Empleado empleado2 = new Empleado("Jose Perez", "Contabilidad");
        Empleado empleado3 = new Empleado("Robert Robertson", "Bodega");

        try{
            empleado1.setSalario(200);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nEl salario del encargado de RRHH es: " + empleado1.getSalario());
        System.out.println("El nombre del asistente del gerente de Contabilidad es: " + empleado2.getNombre());
        System.out.println("El nombre departamento de Rober Robertson es: " +empleado3.getDepartamento());

    }


}
