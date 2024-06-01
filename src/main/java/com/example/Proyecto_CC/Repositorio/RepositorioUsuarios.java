/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Proyecto_CC.Repositorio;

import com.example.Proyecto_CC.Entidades.Usuarios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wandazavaleta
 */
@Repository

public interface RepositorioUsuarios extends JpaRepository <Usuarios,Integer> {
    
}
