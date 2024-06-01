/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Controlador;

import com.example.Proyecto_CC.Entidades.EntidadesSolicitudesSinAutorizar;
import com.example.Proyecto_CC.Repositorio.RepositorioSolicitudesSinAutorizar;
import com.example.Proyecto_CC.Servicios.ServiciosSolicitudesSinAutorizar;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wandazavaleta
 */
@RestController
@RequestMapping("/centro")
public class ControladorSolicitudesSinAutorizar{
    @Autowired
    ServiciosSolicitudesSinAutorizar centro3;
    
    @GetMapping("/solicitudesSNA")
    public List<EntidadesSolicitudesSinAutorizar>solicitudes(){
        return centro3.obtenerTodosSolicitudesSNA();             
}
  
    @PostMapping("/solicitudesSNA")
 public ResponseEntity<?> insertarSolicitud(
        int id, String nombre, int no_personal, String correo, String seccion, String materia,
        String centro_de_computo,
        @RequestParam("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha,
        @RequestParam("hora_inicio") LocalTime hora_inicio,
        @RequestParam("hora_fin") LocalTime hora_fin,
        String carrera, String estado) {

    
    // Continuar con la inserción de la solicitud
    EntidadesSolicitudesSinAutorizar e = new EntidadesSolicitudesSinAutorizar();
    e.setId(id);
    e.setNombre(nombre);
    e.setNo_personal(no_personal);
    e.setCorreo(correo);
    e.setSeccion(seccion);
    e.setMateria(materia);
    e.setCentro_de_computo(centro_de_computo);
    e.setFecha(fecha);
    e.setHora_inicio(Time.valueOf(hora_inicio));
    e.setHora_fin(Time.valueOf(hora_fin));
    e.setCarrera(carrera);
    e.setEstado(estado);

    if (centro3.insertarSolicitudesSNA(e)) {
        return ResponseEntity.ok().body("Solicitud insertada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al insertar la solicitud.");
    }
}


   

  @DeleteMapping("/solicitudesSNA")
public ResponseEntity<?> eliminarSolicitud(
        int id, String nombre, int no_personal, String correo, String seccion, String materia, String centro_de_computo,
        @RequestParam("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha,
        @RequestParam("hora_inicio") @DateTimeFormat(pattern = "HH:mm:ss") LocalTime hora_inicio,
        @RequestParam("hora_fin") @DateTimeFormat(pattern = "HH:mm:ss") LocalTime hora_fin,
        String carrera, String estado) {

    EntidadesSolicitudesSinAutorizar e = new EntidadesSolicitudesSinAutorizar();
    e.setId(id);
    e.setNombre(nombre);
    e.setNo_personal(no_personal);
    e.setCorreo(correo);
    e.setSeccion(seccion);
    e.setMateria(materia);
    e.setCentro_de_computo(centro_de_computo);
    e.setFecha(fecha);
    e.setHora_inicio(Time.valueOf(hora_inicio));
    e.setHora_fin(Time.valueOf(hora_fin));
    e.setCarrera(carrera);
    e.setEstado(estado);

    if (centro3.eliminarSolicitudesSNA(e)) {
        return ResponseEntity.ok().body(centro3.obtenerTodosSolicitudesSNA());
    }

    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar la solicitud.");
}
}