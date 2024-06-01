/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Controlador;

import com.example.Proyecto_CC.Entidades.EntidadesEspacios;
import com.example.Proyecto_CC.Servicios.ServiciosEspacios;
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

public class ControladorEspacios {
    @Autowired
    ServiciosEspacios centro2;
    
    @GetMapping("/espacios")
    public List<EntidadesEspacios>espacios(){
        return centro2.obtenerTodosEspacios();             
}
    @PostMapping("/espacios") 
   public List<EntidadesEspacios>insertarEspacios(int id, String nombre){
      EntidadesEspacios e = new EntidadesEspacios();
              e.setId(id);
              e.setNombre(nombre);
              
              if(centro2.insertarEspacios(e)){
                  return centro2.obtenerTodosEspacios();
              }
              
        return null;
        }
   
    @DeleteMapping("/espacios") 
   public List<EntidadesEspacios>eliminarEspacios(int id, String nombre){
      EntidadesEspacios e = new EntidadesEspacios();
              e.setId(id);
              e.setNombre(nombre);
              
            if(centro2.eliminarEspacios(e)){
                  return centro2.obtenerTodosEspacios();
              }
              
        return null;
        }
   
}
