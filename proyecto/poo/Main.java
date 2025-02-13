/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.poo;

import java.util.Scanner;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializamos los gestores
        UserManager userManager = new UserManager();
        FlightManager flightManager = new FlightManager();
        BookingManager bookingManager = new BookingManager();
        
        // Creamos algunos vuelos disponibles
        Vuelo vuelo1 = new Vuelo("Aerolínea 1", "Bogotá", "Medellín", new Date(), new Date(), 150.0);
        Vuelo vuelo2 = new Vuelo("Aerolínea 2", "Bogotá", "Cartagena", new Date(), new Date(), 200.0);
        flightManager.agregarReservable(vuelo1);
        flightManager.agregarReservable(vuelo2);
        
        // Variables para el usuario
        Usuario usuarioLogueado = null;
        
        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Mostrar vuelos disponibles");
            System.out.println("4. Realizar reserva");
            System.out.println("5. Ver mis reservas");
            System.out.println("6. Cancelar reserva");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner
            
            switch (opcion) {
                case 1: // Registrar Usuario
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese email: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String contrasena = scanner.nextLine();
                    Usuario nuevoUsuario = new Cliente(nombre, email, contrasena);
                    userManager.registrarUsuario(nuevoUsuario);
                    System.out.println("Usuario registrado exitosamente.");
                    break;
                
                case 2: // Iniciar Sesión
                    System.out.print("Ingrese email: ");
                    String emailLogin = scanner.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String contrasenaLogin = scanner.nextLine();
                    usuarioLogueado = userManager.autenticarUsuario(emailLogin, contrasenaLogin);
                    if (usuarioLogueado != null) {
                        System.out.println("Bienvenido " + usuarioLogueado.getNombre());
                    } else {
                        System.out.println("Usuario o contraseña incorrectos.");
                    }
                    break;
                
                case 3: // Mostrar vuelos disponibles
                    if (usuarioLogueado == null) {
                        System.out.println("Debe iniciar sesión primero.");
                    } else {
                        flightManager.mostrarReservas();
                    }
                    break;
                
                case 4: // Realizar reserva
                    if (usuarioLogueado == null) {
                        System.out.println("Debe iniciar sesión primero.");
                    } else {
                        System.out.print("Ingrese el número de vuelo que desea reservar (1 o 2): ");
                        int vueloSeleccionado = scanner.nextInt();
                        if (vueloSeleccionado == 1) {
                            Reserva reserva = new Reserva(usuarioLogueado, vuelo1);
                            bookingManager.realizarReserva(usuarioLogueado, vuelo1);
                        } else if (vueloSeleccionado == 2) {
                            Reserva reserva = new Reserva(usuarioLogueado, vuelo2);
                            bookingManager.realizarReserva(usuarioLogueado, vuelo2);
                        } else {
                            System.out.println("Opción no válida.");
                        }
                    }
                    break;
                
                case 5: // Ver mis reservas
                    if (usuarioLogueado == null) {
                        System.out.println("Debe iniciar sesión primero.");
                    } else {
                        bookingManager.verReservas(usuarioLogueado);
                    }
                    break;
                
                case 6: // Cancelar reserva
                    if (usuarioLogueado == null) {
                        System.out.println("Debe iniciar sesión primero.");
                    } else {
                        System.out.print("Ingrese el número de reserva que desea cancelar (1 o 2): ");
                        int reservaSeleccionada = scanner.nextInt();
                        if (reservaSeleccionada == 1) {
                            // Cancelar reserva 1
                            bookingManager.cancelarReserva(new Reserva(usuarioLogueado, vuelo1));
                        } else if (reservaSeleccionada == 2) {
                            // Cancelar reserva 2
                            bookingManager.cancelarReserva(new Reserva(usuarioLogueado, vuelo2));
                        } else {
                            System.out.println("Opción no válida.");
                        }
                    }
                    break;
                
                case 7: // Salir
                    System.out.println("Gracias por usar el sistema.");
                    scanner.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
