package Examenes.Examen;

public class bebida  extends itemMenu{
    private int volumenMl;

    public bebida (String id, String nombre, double precio, int volumenMl){
        super(id, nombre, precio);
        this.volumenMl = volumenMl;
    }


    @Override
    public String obteneDetalles() {
        return "El id de la bebida es " + getId() + ", el nombre de la bebida es "+ getNombre() + ", su precio es "+ getPrecio() + " y su contenido es de " + volumenMl+ "mililitros";
    }
}
