import java.util.ArrayList;

public class Producto {
    private String nombre;
    private String categoria;
    private String presentacion;
    private double precio;
    
    

    public Producto(String nombre,String categoria, String presentacion, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.presentacion = presentacion;
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public double getPrecio() {
        return precio;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public String mostrarProducto(){

        return "Nombre: "+ nombre + "\nPresentacion: "+presentacion +"\nCategoria: "+categoria +"\nPrecio Q: "+ precio;
    }
    public static void main(String[] args) {
        
        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(new Producto("Arroz", "Productos Basicos", "1 Libra", 4.55));
        inventario.add(new Producto("Leche","Lacteos", "Caja 1 L", 12.50));
        inventario.add(new Producto("Frijol", "Basicos", "Bolsa 1 libra", 6.00));

        System.out.println("");
        for (Producto producto : inventario){
            System.out.println(producto.getNombre());
        }
    }
}
