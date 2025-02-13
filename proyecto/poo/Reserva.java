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

public class Reserva {
    private Usuario usuario;
    private Vuelo vuelo;
    private Date fechaReserva;
    private boolean confirmada;

    public Reserva(Usuario usuario, Vuelo vuelo) {
        this.usuario = usuario;
        this.vuelo = vuelo;
        this.fechaReserva = new Date();
        this.confirmada = false;
    }

    public void confirmarReserva() {
        this.confirmada = true;
    }

    // Getters y Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public boolean isConfirmada() {
        return confirmada;
    }
}
