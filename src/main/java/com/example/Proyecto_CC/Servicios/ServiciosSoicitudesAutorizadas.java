/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Servicios;

import com.example.Proyecto_CC.Entidades.EntidadesSolicitudesAutorizadas;
import com.example.Proyecto_CC.Entidades.Usuarios;
import com.example.Proyecto_CC.Repositorio.RepositorioSolicitudesAutorizadas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wandazavaleta
 */
     @Service

public class ServiciosSoicitudesAutorizadas {
     @Autowired
    RepositorioSolicitudesAutorizadas entidadesA;
    public List<EntidadesSolicitudesAutorizadas> obtenerTodosSolicitudesA(){
        return entidadesA.findAll();
    }
    public boolean insertarSolicitudesA(EntidadesSolicitudesAutorizadas e){
        boolean respuesta = false;
        try{
            entidadesA.save(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
        respuesta = false;
    }
        return respuesta;
    }
    
     public boolean eliminarsSolicitudesA(EntidadesSolicitudesAutorizadas e){
        boolean respuesta = false;
        try{
            entidadesA.delete(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
        respuesta = false;
    }
        return respuesta;
    }
}
