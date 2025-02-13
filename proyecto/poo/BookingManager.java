/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.poo;

/**
 *
 * @author User
 */
import java.util.List;
import java.util.ArrayList;

public class BookingManager {
    private List<Reserva> reservas;

    public BookingManager() {
        reservas = new ArrayList<>();
    }

    public void realizarReserva(Usuario usuario, Vuelo vuelo) {
        Reserva reserva = new Reserva(usuario, vuelo);
        reservas.add(reserva);
        System.out.println("Reserva realizada para el vuelo: " + vuelo.getOrigen() + " - " + vuelo.getDestino());
    }

    public void verReservas(Usuario usuario) {
        for (Reserva reserva : reservas) {
            if (reserva.getUsuario().equals(usuario)) {
                System.out.println("Reserva de vuelo: " + reserva.getVuelo().getOrigen() + " - " + reserva.getVuelo().getDestino());
            }
        }
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Reserva cancelada para el vuelo: " + reserva.getVuelo().getOrigen() + " - " + reserva.getVuelo().getDestino());
    }
}
