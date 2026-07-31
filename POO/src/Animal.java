import java.util.ArrayList;

public class Animal {
    private String nombre;
    private int edad; //años
    private String especie;
    
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void sonido(){
        System.out.println(nombre + " esta emitiendo un sonido. ");
    }

    public static void main(String[] args) {

        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Animal("Alex", 2, "Leon Africano"));
        zoo.add(new Animal("Marty", 3, "Zebra"));
        zoo.add(new Animal("Julien", 5,"Lemur de cola anillada"));
        zoo.add(new Animal("Gloria", 4, "Hipopótamo"));
        
        System.out.println();

        for ( Animal animal : zoo){
            animal.sonido();
        }

        Animal perro = new Perro ("Max", 5, "Amarillo");
        Animal gato = new Gato("Puma", 3, "Persa");

        System.out.println();
        perro.sonido();
        gato.sonido();
    }
}
