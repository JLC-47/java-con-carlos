public class Sala3D  extends Reserva{
    private double valorLentes;

    public Sala3D(String codigo, String nombrePelicula, double costoBase, double valorLentes){
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }

    public double getValorLentes() {
        return valorLentes;
    }
    public void setValorLentes(double valorLentes) {
        this.valorLentes = valorLentes;
    }

    public double totalValorLentes(){
        double total = 0;
        total += valorLentes;
        return total;
    }


    @Override
    public String obtenerDetalles() {
        // TODO Auto-generated method stub
        String resultado = super.obtenerDetalles();
        resultado += " el valor de los lentes es de: " + valorLentes;
        return resultado;
    }
}
