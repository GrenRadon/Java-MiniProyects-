/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalreport;

/**
 *
 * @author julian
 */
public class Coordinadores {
    long numEmpleado, celular, telOficina;
    double sueldo;
    String nombreCompleto, fechaCumpleanios, correoElectronico, departamentoAdscrito, carreraCoordinada;

    public Coordinadores(long numEmpleado, long celular, long telOficina, double sueldo, String nombreCompleto, String fechaCumpleanios, String correoElectronico, String departamentoAdscrito, String carreraCoordinada) {
        this.numEmpleado = numEmpleado;
        this.celular = celular;
        this.telOficina = telOficina;
        this.sueldo = sueldo;
        this.nombreCompleto = nombreCompleto;
        this.fechaCumpleanios = fechaCumpleanios;
        this.correoElectronico = correoElectronico;
        this.departamentoAdscrito = departamentoAdscrito;
        this.carreraCoordinada = carreraCoordinada;
    }
    
    //Getters section

    public long getNumEmpleado() {
        return numEmpleado;
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

    public String getNombreCompleto() {
        return nombreCompleto;
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

    public String getCarreraCoordinada() {
        return carreraCoordinada;
    }
    
    
    //Setters section 

    public void setNumEmpleado(long numEmpleado) {
        this.numEmpleado = numEmpleado;
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

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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

    public void setCarreraCoordinada(String carreraCoordinada) {
        this.carreraCoordinada = carreraCoordinada;
    }
    
    
        
}
