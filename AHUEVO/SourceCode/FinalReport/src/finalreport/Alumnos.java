/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalreport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julian
 */
public class Alumnos {
    private long numeroCuenta, celular;
    private int semestre;
    private String nombreCompleto, fechaDeCumpleaios, correoElectronico, carrera;
    private List<String> materias = new ArrayList<String>();
    
    public Alumnos(long numeroCuenta_, long celular_, int semestre_, String nombreCompleto_, String fechaDeCumpleanios_, String correoElectronico_, String carrera_, List<String> materias_){
        this.numeroCuenta = numeroCuenta_;
        this.celular = celular_;
        this.semestre = semestre_;
        this.nombreCompleto = nombreCompleto_;
        this.fechaDeCumpleaios = fechaDeCumpleanios_;
        this.correoElectronico = correoElectronico_;
        this.carrera = carrera_;
        this.materias = materias_;
    }
    
    //Getters section

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getCelular() {
        return celular;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getFechaDeCumpleaios() {
        return fechaDeCumpleaios;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getCarrera() {
        return carrera;
    }

    public List<String> getMaterias() {
        return materias;
    }
    
    //Setters section

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setFechaDeCumpleaios(String fechaDeCumpleaios) {
        this.fechaDeCumpleaios = fechaDeCumpleaios;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }   

    
}
