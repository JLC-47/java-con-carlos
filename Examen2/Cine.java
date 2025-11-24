public class Cine {
    public static void main(String[] args) {
        GestorReservas reservas = new GestorReservas(4);
        

        Reserva salaT1 = new SalaTradicional("104", "Transformers: La era de la extinción", 10000, 165);
        Reserva salaT2 = new SalaTradicional("105", "Rampage: devastación", 10000, 107);
        Reserva sala3D1 = new Sala3D("106", "Avengers: Endgame", 12000, 3000);
        Reserva sala3D2 = new Sala3D("107", "Spider-Man: sin camino a casa", 12000, 3000);

        reservas.agregarReserva(salaT1);
        reservas.agregarReserva(salaT2);
        reservas.agregarReserva(sala3D1);
        reservas.agregarReserva(sala3D2);

        double total1 = 0;
        double total2 = 0;


        for (int i = 0; i < reservas.getReservas().length; i ++){
            System.out.println(reservas.getReservas()[i].obtenerDetalles());
            total1 += reservas.getReservas()[i].getCostoBase() ;
            
        }
        System.out.println("El total es: " + total1);
    }

    
    
    
}
    
