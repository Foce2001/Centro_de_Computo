/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Proyecto_CC.Repositorio;

import com.example.Proyecto_CC.Entidades.EntidadesLogin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author wandazavaleta
 */
public interface RepositorioLogin extends JpaRepository<EntidadesLogin,Integer> {
    EntidadesLogin findByUsuario(String usuario);
}

 
