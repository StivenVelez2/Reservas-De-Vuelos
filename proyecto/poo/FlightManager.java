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

public class FlightManager {
    private List<Reservable> itemsReservables;

    public FlightManager() {
        itemsReservables = new ArrayList<>();
    }

    public void agregarReservable(Reservable reservable) {
        itemsReservables.add(reservable);
    }

    public void mostrarReservas() {
        for (Reservable item : itemsReservables) {
            if (item instanceof Vuelo) {
                Vuelo vuelo = (Vuelo) item;
                System.out.println("Vuelo: " + vuelo.getOrigen() + " - " + vuelo.getDestino());
                System.out.println("Precio: " + vuelo.getPrecio());
            }
        }
    }
}
