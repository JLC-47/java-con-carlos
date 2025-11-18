package Examenes.Examen;

public class itemMenu {
    public static int length;
    private String id;
    private String nombre;
    private double precio;
    
    
    public itemMenu (String id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }



    public String obteneDetalles(){
        return "El id del plato es " + id + ", el nombre del plato es "+ nombre + " y su precio es "+ precio;
    }

    public double precioTotal(){
        double total = 0;
        total += precio;
        return total;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
