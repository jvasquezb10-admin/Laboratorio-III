public class Perro extends Animal {

    public Perro(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }

    @Override
    public void sonido(){
        System.out.println(getNombre() + " dice guauu guauu. ");
    }

    public static void main(String[] args) {
        Perro doverman = new Perro("Rocky", 5,"Doverman" );

        doverman.sonido();
    }

}
