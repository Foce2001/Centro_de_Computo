/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Controlador;

import com.example.Proyecto_CC.Entidades.EntidadesSolicitudesAutorizadas;
import com.example.Proyecto_CC.Servicios.ServiciosSoicitudesAutorizadas;
import java.sql.Time;
import java.util.Date;
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
public class ControladorSolicitudesAutorizadas {
    @Autowired
    ServiciosSoicitudesAutorizadas centro4;
    
    @GetMapping("/solicitudes")
    public List<EntidadesSolicitudesAutorizadas>solicitudes(){
        return centro4.obtenerTodosSolicitudesA();             
}
    
    @PostMapping("/solicitudes") 
   public List<EntidadesSolicitudesAutorizadas>insertarsolicitudesA(int id, String nombre, int no_personal, String correo, String seccion, String materia, String centro_de_computo, Date fecha, Time hora_inicio, Time hora_fin, String carrera, String estado){
      EntidadesSolicitudesAutorizadas e = new EntidadesSolicitudesAutorizadas();
              e.setId(id);
              e.setNombre(nombre);
              e.setNo_personal(no_personal);
              e.setCorreo(correo);
              e.setSeccion(seccion);
              e.setMateria(materia);
              e.setCentro_de_computo(centro_de_computo);
              e.setFecha(fecha);
              e.setHora_inicio(hora_inicio);
              e.setHora_fin(hora_fin);
              e.setCarrera(carrera);
              e.setEstado(estado);

              if(centro4.insertarSolicitudesA(e)){
                  return centro4.obtenerTodosSolicitudesA();
              }
              
        return null;
        }
   
     @DeleteMapping("/solicitudes") 
   public List<EntidadesSolicitudesAutorizadas>eliminarSolicitudesA(int id, String nombre, int no_personal, String correo, String seccion, String materia, String centro_de_computo, Date fecha, Time hora_inicio, Time hora_fin, String carrera, String estado){
      EntidadesSolicitudesAutorizadas e = new EntidadesSolicitudesAutorizadas();
              e.setId(id);
              e.setNombre(nombre);
              e.setNo_personal(no_personal);
              e.setCorreo(correo);
              e.setSeccion(seccion);
              e.setMateria(materia);
              e.setCentro_de_computo(centro_de_computo);
              e.setFecha(fecha);
              e.setHora_inicio(hora_inicio);
              e.setHora_fin(hora_fin);
              e.setCarrera(carrera);
              e.setEstado(estado);
              
            if(centro4.eliminarsSolicitudesA(e)){
                  return centro4.obtenerTodosSolicitudesA();
              }
              
        return null;
        }
}
