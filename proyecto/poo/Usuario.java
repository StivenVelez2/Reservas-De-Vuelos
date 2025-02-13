/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.poo;

/**
 *
 * @author User
 */
// Clase base Usuario
public class Usuario {
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(String nombre, String email, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    // Métodos comunes a todos los usuarios
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Email: " + email);
    }
}

// Clase derivada Cliente


// Clase derivada Administrador
