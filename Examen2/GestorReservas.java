public class GestorReservas {
    private Reserva[] reservas;
    private int reservaActual;
    private int numeroReservas;


    public GestorReservas(int numeroReservas){
        this.numeroReservas = numeroReservas;
        reservas = new Reserva[numeroReservas];
        reservaActual = 0;
    }

    public void agregarReserva(Reserva r){
        reservas[reservaActual] = r;
        reservaActual +=1;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    

}
