/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Controlador;

import com.example.Proyecto_CC.Controlador.Modelo.LoginRequest;
import com.example.Proyecto_CC.Servicios.ServiciosLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author wandazavaleta
 */
@RestController
@RequestMapping("/centro")
public class ControladorLogin {
    @Autowired
    private ServiciosLogin Login;

    @PostMapping("/login")
    
public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
    boolean isAuthenticated = Login.authenticate(loginRequest.getUsuario(), loginRequest.getContrasena());

    if (isAuthenticated) {
        return ResponseEntity.ok("Inicio de sesión exitoso");
    } else {
        return ResponseEntity.status(401).body("Nombre de usuario o contraseña inválidos");
    }
}
}
