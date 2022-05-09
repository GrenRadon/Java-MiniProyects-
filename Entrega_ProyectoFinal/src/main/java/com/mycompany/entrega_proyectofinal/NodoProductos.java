package com.mycompany.entrega_proyectofinal;

/**
 *
 * @author Julián Villamizar
 */
public class NodoProductos {
    //Estructura de datos de pila, FIFO
    
    // Variable en la cual guardaremos el valor númerico de algunos de los ejercicios que necesite pilas.
    private String nombreProducto;
    private String nacionalidadProducto;
    private int cantidadProducto;
    private int Nit;
    private float precio;
    // Variable encargada de entrelazar nuestros nodos puesto que nos guarda la posición siguiente de nuestra pila.
    private NodoProductos siguiente;

    //Constructor en el que inicializamos el valor de las variables.
    public void Nodo(){
        this.nombreProducto = "Default";
        this.nacionalidadProducto = "Default";
        this.cantidadProducto = 0;
        this.Nit = 0;
        this.precio = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos (Estos nos devuelven los valores respectivos de cada atributo de la clase)
    public String getnombreProducto() {
        return nombreProducto;
    } 
    public String getnacionalidadProducto(){
        return nacionalidadProducto;
    }
    public int getcantidadProducto(){
        return cantidadProducto;
    }
    public int getNit(){
        return Nit;
    }
    public float getprecio(){
        return precio;
    }
    
    public NodoProductos getSiguiente() {
        return siguiente;
    }
    

    public void setnombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setnacionalidadProducto(String nacionalidadProducto) {
        this.nacionalidadProducto = nacionalidadProducto;
    }
    public void setcantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    public void setNit(int Nit) {
        this.Nit = Nit;
    }
    public void setprecio(float precio) {
        this.precio = precio;
    }
    
    public void setSiguiente(NodoProductos siguiente) {
        this.siguiente = siguiente;
    }
}
