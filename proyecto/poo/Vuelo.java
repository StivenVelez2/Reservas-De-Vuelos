/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.poo;

/**
 *
 * @author User
 */
import java.util.Date;

public class Vuelo implements Reservable {
    private String aerolinea;
    private String origen;
    private String destino;
    private Date fechaSalida;
    private Date fechaLlegada;
    private double precio;
    private boolean reservado;

    public Vuelo(String aerolinea, String origen, String destino, Date fechaSalida, Date fechaLlegada, double precio) {
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.precio = precio;
        this.reservado = false;
    }

    @Override
    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Vuelo reservado exitosamente.");
        } else {
            System.out.println("Este vuelo ya está reservado.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva cancelada exitosamente.");
        } else {
            System.out.println("No hay reserva que cancelar.");
        }
    }

    // Getters
    public String getAerolinea() {
        return aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isReservado() {
        return reservado;
    }
}
