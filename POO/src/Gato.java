public class Gato extends Animal{

    public Gato(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }

    @Override
    public void sonido(){
        System.out.println(getNombre() + " dice Miauu miauu");
    }
}
