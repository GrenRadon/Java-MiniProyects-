/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrega_proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Julián Villamizar
 */
public class ProductoEjer4 {
    private String nombreProducto;
    private String nacionalidadProducto;
    private int cantidadEnExistencia;
    private int Nit;
    private float precio;
    private final int puntoDeReorden=10;
    
    
    //Objetos a otras clases, por ejemplo, pila para crear una pila que almacene los valores de horas trabjadas por día
    private final PilaProductos listaProductos=new PilaProductos();
    //Objeto para capturar entradas del usuario
    private final Scanner sc= new Scanner(System.in);
    
    //Constructor de la clase
    ProductoEjer4(){
    
    }
    
    //Declaración de getters
    public String getNombreProducto2(){
        return nombreProducto;
    }
    public String getNacionalidadProducto2(){
        return nacionalidadProducto;
    }
    public int getcantidadEnExistencia2(){
        return cantidadEnExistencia;
    }
    
    public int getNit2(){
        return Nit;
    }
    public float getPrecio2(){
        return precio;
    }
    public int getpuntoReorden(){
        return puntoDeReorden;
    }
    
    public PilaProductos getPilaObjectProducto2(){
        return listaProductos;
    }
    
    //Declaración de setters
    public void setNombreProducto2(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setNacionalidadProducto2(String nacionalidadProducto) {
        this.nacionalidadProducto = nacionalidadProducto;
    }
    public void setcantidadEnExistencia2(int cantidadEnExistencia) {
        this.cantidadEnExistencia = cantidadEnExistencia;
    }
    public void setNit2(int Nit){
        this.Nit = Nit;
    }
    public void setPrecio2(float precio) {
        this.precio = precio;
    }

    public void setApilamientoProductos2(String nombreProducto,String nacionalidadProducto,int cantidadProducto,int Nit,float precio)
    {
        this.listaProductos.apilarProductos(nombreProducto,nacionalidadProducto,cantidadProducto,Nit,precio);
    }
    
    //Declaración de métodos
    void capturaDeDatosProducto2(){
        System.out.print("Por favor, digite el nombre del producto: ");
        setNombreProducto2(sc.nextLine());
        System.out.print("Por favor, digite la nacionalidad del producto: ");
        setNacionalidadProducto2(sc.nextLine());
        System.out.print("Por favor, digite la cantidad del producto: ");
        setcantidadEnExistencia2(sc.nextInt());
        System.out.print("Por favor, digite el NIT del producto: ");
        setNit2(sc.nextInt());
        System.out.print("Por favor, el precio del producto (por unidad): ");
        setPrecio2(sc.nextFloat());
        System.out.println("Carga de productos...");
        setApilamientoProductos2(getNombreProducto2(),getNacionalidadProducto2(),getcantidadEnExistencia2(),getNit2(),getPrecio2());
    }
}
