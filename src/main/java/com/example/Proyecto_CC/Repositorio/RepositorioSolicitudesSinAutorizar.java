/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Proyecto_CC.Repositorio;

import com.example.Proyecto_CC.Entidades.EntidadesSolicitudesSinAutorizar;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wandazavaleta
 */
@Repository

public interface RepositorioSolicitudesSinAutorizar extends JpaRepository<EntidadesSolicitudesSinAutorizar, Integer> {
   
}




