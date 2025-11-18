package Examenes.Examen;

public class platoComida extends itemMenu {
    private boolean esVegetariano;


    public platoComida (String id, String nombre, double precio, boolean esVegetariano){
        super(id, nombre, precio);
        this.esVegetariano = esVegetariano;
    }


    @Override
    public String obteneDetalles() {
        if (esVegetariano == true) {
            System.out.println("Lo que pidas es comida vegana");
        }else
        System.out.println("No es comida vegana");
        return "El id de este plato es "+ getId() + " y su nombre es "+ getNombre() + " y el valor de este es " + getPrecio();
    }
}
