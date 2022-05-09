package com.mycompany.entrega_proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Julián Villamizar
 */
public class EstudianteEjer2 {
    private String nombreEstudiante;
    private String apellidosEstudiante;
    private String correoEstudiante;
    private String carreraEstudiante;
    private double DPIEstudiante;
    private double codigoEstudiante;
    
    //Objetos a otras clases, por ejemplo, pila para crear una pila que almacene los valores de horas trabjadas por día
    private final Pila listaNotas=new Pila();
    //Objeto para capturar entradas del usuario
    private final Scanner sc= new Scanner(System.in);
    
    //Constructor de la clase
    EstudianteEjer2(){
    
    }
    
    //Declaración de getters
    public String getnombreEstudiante(){
        return nombreEstudiante;
    }
    public String getapellidosEstudiante(){
        return apellidosEstudiante;
    }
    public String getcorreoEstudiante(){
        return correoEstudiante;
    }
    
    public String getcarreraEstudiante(){
        return carreraEstudiante;
    }
    public double getDPIEstudiante(){
        return DPIEstudiante;
    }
    public double getcodigoEstudiante(){
        return codigoEstudiante;
    }
    public Pila getPilaObjectEstudiantes(){
        return listaNotas;
    }
    
    //Declaración de setters
    public void setnombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public void setapellidosEstudiante(String apellidosEstudiante) {
        this.apellidosEstudiante = apellidosEstudiante;
    }
    public void setcorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }
    public void setcarreraEstudiante(String carreraEstudiante){
        this.carreraEstudiante = carreraEstudiante;
    }
    public void setDPIEstudiante(double DPIEstudiante) {
        this.DPIEstudiante = DPIEstudiante;
    }

    public void setApilamientoNotasDeAUna(float valorEntrada)
    {
        this.listaNotas.apilar(valorEntrada);
    }
    
    //Declaración de métodos
    void capturaDeDatosEstudiante(int numeroNotas){
        
        System.out.print("Por favor, digite el nombre del estudiante: ");
        setnombreEstudiante(sc.nextLine());
        System.out.print("Por favor, digite los apellidos del estudiante: ");
        setapellidosEstudiante(sc.nextLine());
        System.out.print("Por favor, digite el correo electrónico del estudiante: ");
        setcorreoEstudiante(sc.nextLine());
        System.out.print("Por favor, digite la carrera del estudiante: ");
        setcarreraEstudiante(sc.nextLine());
        
        System.out.print("Por favor, digite el DPI del estudiante: ");
        setDPIEstudiante(sc.nextDouble());
        
        for(int i=0;i<numeroNotas;i++){
            System.out.print("Por favor, digite la nota número "+String.valueOf(i+1)+" del estudiante: ");
            setApilamientoNotasDeAUna(sc.nextFloat());
        }
    }
}
