package proyecto.poo;

import java.util.List;
import java.util.ArrayList;

public class UserManager {
    private List<Usuario> usuarios;

    public UserManager() {
        usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario autenticarUsuario(String email, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getContrasena().equals(contrasena)) {
                return usuario;
            }
        }
        return null; // Usuario no encontrado
    }
}
