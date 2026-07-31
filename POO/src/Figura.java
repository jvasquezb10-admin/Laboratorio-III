import java.util.ArrayList;

abstract class Figura {

    public abstract double area();

    public static void main(String[] args) {
        
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(12));
        figuras.add(new Rectangulo(10, 5));
        figuras.add(new Circulo(4));
        figuras.add(new Triangulo(8, 6));

        for ( Figura figura : figuras){
            System.out.println(figura.area());
        }


    }

}

