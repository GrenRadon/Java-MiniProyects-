package com.mycompany.entrega_proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Julián Villamizar
 */
public class ProductoEjer3 {
    private String nombreProducto;
    private String nacionalidadProducto;
    private int cantidadProducto;
    private int Nit;
    private float precio;
    
    
    //Objetos a otras clases, por ejemplo, pila para crear una pila que almacene los valores de horas trabjadas por día
    private final PilaProductos listaProductos=new PilaProductos();
    //Objeto para capturar entradas del usuario
    private final Scanner sc= new Scanner(System.in);
    
    //Constructor de la clase
    ProductoEjer3(){
    
    }
    
    //Declaración de getters
    public String getNombreProducto(){
        return nombreProducto;
    }
    public String getNacionalidadProducto(){
        return nacionalidadProducto;
    }
    public int getCantidadProducto(){
        return cantidadProducto;
    }
    
    public int getNit(){
        return Nit;
    }
    public float getPrecio(){
        return precio;
    }
    
    public PilaProductos getPilaObjectProducto(){
        return listaProductos;
    }
    
    //Declaración de setters
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setNacionalidadProducto(String nacionalidadProducto) {
        this.nacionalidadProducto = nacionalidadProducto;
    }
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    public void setNit(int Nit){
        this.Nit = Nit;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setApilamientoProductos(String nombreProducto,String nacionalidadProducto,int cantidadProducto,int Nit,float precio)
    {
        this.listaProductos.apilarProductos(nombreProducto,nacionalidadProducto,cantidadProducto,Nit,precio);
    }
    
    //Declaración de métodos
    void capturaDeDatosProducto(){
        System.out.print("Por favor, digite el nombre del producto: ");
        setNombreProducto(sc.nextLine());
        System.out.print("Por favor, digite la nacionalidad del producto: ");
        setNacionalidadProducto(sc.nextLine());
        System.out.print("Por favor, digite la cantidad del producto: ");
        setCantidadProducto(sc.nextInt());
        System.out.print("Por favor, digite el NIT del producto: ");
        setNit(sc.nextInt());
        System.out.print("Por favor, el precio del producto (por unidad): ");
        setPrecio(sc.nextFloat());
        System.out.println("Carga de productos...");
        setApilamientoProductos(getNombreProducto(),getNacionalidadProducto(),getCantidadProducto(),getNit(),getPrecio());
    }
}
