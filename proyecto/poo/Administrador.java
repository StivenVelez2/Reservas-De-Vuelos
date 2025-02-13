/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.poo;

/**
 *
 * @author User
 */
public class Administrador extends Usuario {
    public Administrador(String nombre, String email, String contrasena) {
        super(nombre, email, contrasena);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Administrador: " + getNombre() + ", Email: " + getEmail());
    }
}
