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
public class Profesores {
    long numeroProfesor, celular, telOficina;
    double sueldo;
    String nombreProfesor, fechaCumpleanios, correoElectronico, departamentoAdscrito, carreraImparte;
    private List<String> gruposImparte = new ArrayList<String>();

    public Profesores(long numeroProfesor, long celular, long telOficina, double sueldo, String nombreProfesor, String fechaCumpleanios, String correoElectronico, String departamentoAdscrito, String carreraImparte, List<String> gruposImparte) {
        this.numeroProfesor = numeroProfesor;
        this.celular = celular;
        this.telOficina = telOficina;
        this.sueldo = sueldo;
        this.nombreProfesor = nombreProfesor;
        this.fechaCumpleanios = fechaCumpleanios;
        this.correoElectronico = correoElectronico;
        this.departamentoAdscrito = departamentoAdscrito;
        this.carreraImparte = carreraImparte;
        this.gruposImparte = gruposImparte;
    }

    //Getters section
    
    public long getNumeroProfesor() {
        return numeroProfesor;
    }

    public long getCelular() {
        return celular;
    }

    public long getTelOficina() {
        return telOficina;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getFechaCumpleanios() {
        return fechaCumpleanios;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDepartamentoAdscrito() {
        return departamentoAdscrito;
    }

    public String getCarreraImparte() {
        return carreraImparte;
    }

    public List<String> getGruposImparte() {
        return gruposImparte;
    }
    
    //Setters section

    public void setNumeroProfesor(long numeroProfesor) {
        this.numeroProfesor = numeroProfesor;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public void setTelOficina(long telOficina) {
        this.telOficina = telOficina;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setFechaCumpleanios(String fechaCumpleanios) {
        this.fechaCumpleanios = fechaCumpleanios;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setDepartamentoAdscrito(String departamentoAdscrito) {
        this.departamentoAdscrito = departamentoAdscrito;
    }

    public void setCarreraImparte(String carreraImparte) {
        this.carreraImparte = carreraImparte;
    }

    public void setGruposImparte(List<String> gruposImparte) {
        this.gruposImparte = gruposImparte;
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
