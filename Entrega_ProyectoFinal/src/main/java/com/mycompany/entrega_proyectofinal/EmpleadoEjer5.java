
package com.mycompany.entrega_proyectofinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Julián Villamizar
 */
public class EmpleadoEjer5 {
    //Características del empleado
    private String nombreEmpleado;
    private String apellidosEmpleado;
    private String correoEmpleado;
    private String SexoEmpleado;
    private String departamento;
    private double DPI;
    //Una variable que no se puede modificar y será el precio de la hora en USD
    private final int precioPorHoraTrabajo=18;
    private final List<String> diasDeLaSemana =  new ArrayList<>(List.of("Lunes","Martes","Miercoles","Jueves","Viernes"));
    
    //Objetos a otras clases, por ejemplo, pila para crear una pila que almacene los valores de horas trabjadas por día
    private final Pila listaHorasPorDía=new Pila();
    private final Scanner sc= new Scanner(System.in);
    
    // Student class constructor

    EmpleadoEjer5(){
    }
    
    //Declaración de getters
    public String getnombreEmpleado(){
        return nombreEmpleado;
    }
    public String getapellidosEmpleado(){
        return apellidosEmpleado;
    }
    public String getcorreoEmpleado(){
        return correoEmpleado;
    }
    public String getSexoEmpleado(){
        return SexoEmpleado;
    }
    public double getcedulaDPI(){
        return DPI;
    }
    public int getprecioPorHoraTrabajo(){
        return precioPorHoraTrabajo;
    }
    public String getdepartamento(){
        return departamento;
    }
    public Pila getPilaObject(){
        return listaHorasPorDía;
    }
    public List<String> getdiasDeLaSemana(){
        return diasDeLaSemana;
    }
    
    //Declaración de setters
    public void setnombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public void setapellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }
    public void setcorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
    public void setSexoEmpleado(String SexoEmpleado){
        this.SexoEmpleado = SexoEmpleado;
    }
    public void setDPIEmpleado(double DPI) {
        this.DPI = DPI;
    }
    public void setdepartamento(String departamento){
        this.departamento = departamento;
    }

    public void apilamientoDeHorasPorDia(int valorEntrada)
    {
        this.listaHorasPorDía.apilar(valorEntrada);
    }
    
    //Declaración de métodos
    void capturaDeDatosEmpleado(){
        
        System.out.print("Por favor, digite el nombre del empleado: ");
        setnombreEmpleado(sc.nextLine());
        System.out.print("Por favor, digite los apellidos del empleado: ");
        setapellidosEmpleado(sc.nextLine());
        System.out.print("Por favor, digite el correo electrónico del empleado: ");
        setcorreoEmpleado(sc.nextLine());
        System.out.print("Por favor, digite el sexo del empleado: ");
        setSexoEmpleado(sc.nextLine());
        System.out.print("Por favor, digite el departamento del empleado: ");
        setdepartamento(sc.nextLine());
        System.out.print("Por favor, digite el DPI del empleado: ");
        setDPIEmpleado(sc.nextDouble());
        
        
        for(int i=0;i<diasDeLaSemana.size();i++){
            System.out.print("Cantidad de horas trabajadas el día "+diasDeLaSemana.get(i)+": ");
            apilamientoDeHorasPorDia(sc.nextInt()*getprecioPorHoraTrabajo());
        }
    }
}
