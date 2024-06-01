/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Controlador;

import com.example.Proyecto_CC.Entidades.Usuarios;
import com.example.Proyecto_CC.Servicios.ServiciosUsuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wandazavaleta
 */
@RestController
@RequestMapping("/centro")
public class ControladorUsuarios {
  
    @Autowired
    ServiciosUsuarios centro1;
    
    @GetMapping("/usuarios")
    public List<Usuarios>usuarios(){
        return centro1.obtenerTodosUsuarios();             
}
    @PostMapping("/usuarios") 
   public List<Usuarios>insertarusuarios(int id, String nombre, String apellidos, String correo, int no_personal, String rol, String usuario, String contrasena){
      Usuarios e = new Usuarios();
              e.setId(id);
              e.setNombre(nombre);
              e.setApellidos(apellidos);
              e.setCorreo(correo);
              e.setNo_personal(no_personal);
              e.setRol(rol);
              e.setUsuario(usuario);
              e.setContrasena(contrasena);

              if(centro1.insertarUsuarios(e)){
                  return centro1.obtenerTodosUsuarios();
              }
              
        return null;
        }
   
    @DeleteMapping("/usuarios") 
   public List<Usuarios>eliminarUsuarios(int id, String nombre, String apellidos, String correo, int no_personal, String rol, String usuario, String contrasena){
      Usuarios e = new Usuarios();
              e.setId(id);
              e.setNombre(nombre);
              e.setApellidos(apellidos);
              e.setCorreo(correo);
              e.setNo_personal(no_personal);
              e.setRol(rol);
              e.setUsuario(usuario);
              e.setContrasena(contrasena);
              
            if(centro1.eliminarUsuarios(e)){
                  return centro1.obtenerTodosUsuarios();
              }
              
        return null;
        }
 
    
} 
    
