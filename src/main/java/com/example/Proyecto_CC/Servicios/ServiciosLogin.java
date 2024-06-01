package com.example.Proyecto_CC.Servicios;

import com.example.Proyecto_CC.Entidades.EntidadesLogin;
import com.example.Proyecto_CC.Repositorio.RepositorioLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosLogin {

    @Autowired
    private RepositorioLogin login;

    public boolean insertarUsuarios(EntidadesLogin e) {
        boolean respuesta = false;
        try {
            login.save(e);
            respuesta = true;
        } catch (Exception error) {
            System.out.println("Error al guardar: " + error);
            respuesta = false;
        }
        return respuesta;
    }

    /**
     * Autentica un usuario verificando sus credenciales.
     *
     * @param usuario el nombre de usuario
     * @param contrasena la contraseña
     * @return true si la autenticación es exitosa, false en caso contrario
     */
    public boolean authenticate(String usuario, String contrasena) {
        boolean isAuthenticated = false;
        try {
            EntidadesLogin user = login.findByUsuario(usuario);
            if (user != null && user.getContrasena().equals(contrasena)) {
                isAuthenticated = true;
            }
        } catch (Exception e) {
            System.out.println("Error durante la autenticación: " + e);
        }
        return isAuthenticated;
    }
}
