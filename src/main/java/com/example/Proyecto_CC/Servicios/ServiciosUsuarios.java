/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Servicios;

import com.example.Proyecto_CC.Entidades.Usuarios;
import com.example.Proyecto_CC.Repositorio.RepositorioUsuarios;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wandazavaleta
 */
     @Service
public class ServiciosUsuarios {
    @Autowired
    RepositorioUsuarios usuarios;
    public List<Usuarios> obtenerTodosUsuarios(){
        return usuarios.findAll();
    }
    
    public boolean insertarUsuarios(Usuarios e){
        boolean respuesta = false;
        try{
            usuarios.save(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
        respuesta = false;
    }
        return respuesta;
    }
    
    public boolean eliminarUsuarios(Usuarios e){
        boolean respuesta = false;
        try{
            usuarios.delete(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
        respuesta = false;
    }
        return respuesta;
    }
    
    
    }
