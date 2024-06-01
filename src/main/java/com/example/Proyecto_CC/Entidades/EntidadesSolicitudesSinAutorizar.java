/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_CC.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Time;
import java.util.Date;


/**
 *
 * @author wandazavaleta
 */
@Entity
@Table(name = "solicitudes_sin_autorizar")

public class EntidadesSolicitudesSinAutorizar {
    @Id
    private int id;
    private String nombre;
    private int no_personal;
    private String correo;
    private String seccion;
    private String materia;
    private String centro_de_computo;
    private Date fecha;
    private Time hora_inicio;
    private Time hora_fin;
    private String carrera;
    private String estado;

    public EntidadesSolicitudesSinAutorizar() {
    }

    public EntidadesSolicitudesSinAutorizar(int id, String nombre, int no_personal, String correo, String seccion, String materia, String centro_de_computo, Date fecha, Time hora_inicio, Time hora_fin, String carrera, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.no_personal = no_personal;
        this.correo = correo;
        this.seccion = seccion;
        this.materia = materia;
        this.centro_de_computo = centro_de_computo;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.carrera = carrera;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNo_personal() {
        return no_personal;
    }

    public void setNo_personal(int no_personal) {
        this.no_personal = no_personal;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCentro_de_computo() {
        return centro_de_computo;
    }

    public void setCentro_de_computo(String centro_de_computo) {
        this.centro_de_computo = centro_de_computo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
