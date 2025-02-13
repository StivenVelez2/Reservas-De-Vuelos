/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.poo;

/**
 *
 * @author User
 */
public class Aeropuerto {
    private String nombre;
    private String ubicacion;

    public Aeropuerto(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
