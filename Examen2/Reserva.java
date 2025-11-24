
public class Reserva {
    // codigo (String), nombrePelicula (String), costoBase (double)
    private String codigo;
    private String nombrePelicula;
    private double costoBase;

    public Reserva(String codigo, String nombrePelicula, double costoBase) {
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase = costoBase;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public double getCostoBase() {
        return costoBase;
    }
    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public String obtenerDetalles(){
        String resultado = "Código: " + codigo + " - Película: " + nombrePelicula + " - Costo base: " + costoBase;
        return resultado;
    }


    


    


   
    
}
