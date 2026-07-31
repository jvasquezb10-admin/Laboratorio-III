import java.util.Scanner;

public class Estudiante {
    private double [] notas;

    public Estudiante(double[] notas) {
        setNotas(notas);
    }

    public double[] getNotas() {
        return notas;
    }
    
    public void setNotas(double[] notas) {
        for (double nota : notas){
            if( nota <0 || nota > 100){
            throw new IllegalArgumentException("todas las notas deben oscilar entre 0 y 100.");
            }
        }
        this.notas = notas;
    }


    public double calcularPromedio() {
        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas notas desea ingresar? ");
        int cantidad = scanner.nextInt();

        double[] notas = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        try{
            Estudiante estudiante1 = new Estudiante(notas);

            System.out.println("Promedio: " + estudiante1.calcularPromedio());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
