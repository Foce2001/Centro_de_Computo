/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Servicios;

import com.example.Proyecto_CC.Entidades.EntidadesEspacios;
import com.example.Proyecto_CC.Repositorio.RepositorioEspacios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wandazavaleta
 */
        @Service

public class ServiciosEspacios {
    @Autowired
    RepositorioEspacios espacios;
    public List<EntidadesEspacios> obtenerTodosEspacios(){
        return espacios.findAll();
    }
    
  public boolean insertarEspacios(EntidadesEspacios e){
        boolean respuesta = false;
        try{
            espacios.save(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
        respuesta = false;
    }
        return respuesta;
    }
  
   public boolean eliminarEspacios(EntidadesEspacios e){
        boolean respuesta = false;
        try{
            espacios.delete(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
        respuesta = false;
    }
        return respuesta;
    }
}
