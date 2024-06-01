/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Servicios;

import com.example.Proyecto_CC.Entidades.EntidadesSolicitudesSinAutorizar;
import com.example.Proyecto_CC.Repositorio.RepositorioSolicitudesSinAutorizar;
import java.util.List;
import static org.hibernate.internal.CoreLogging.logger;
import static org.hibernate.internal.HEMLogging.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wandazavaleta
 */
    @Service

public class ServiciosSolicitudesSinAutorizar {
    @Autowired
    RepositorioSolicitudesSinAutorizar solicitudesSNA;
    
    public List<EntidadesSolicitudesSinAutorizar> obtenerTodosSolicitudesSNA(){
        return solicitudesSNA.findAll();
    }
    
    
  public boolean insertarSolicitudesSNA(EntidadesSolicitudesSinAutorizar e){
        boolean respuesta = false;
        try{
            solicitudesSNA.save(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
        respuesta = false;
    }
        return respuesta;
    }


    
     public boolean eliminarSolicitudesSNA(EntidadesSolicitudesSinAutorizar e){
        boolean respuesta = false;
        try{
            solicitudesSNA.delete(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
        respuesta = false;
    }
        return respuesta;
    }
    
}
