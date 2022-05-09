package com.mycompany.entrega_proyectofinal;

/**
 *
 * @author Julián Villamizar
 */
public class Nodo {
    //Estructura de datos de pila, FIFO
    
    // Variable en la cual guardaremos el valor númerico de algunos de los ejercicios que necesite pilas.
    private int valor;
    private float valor2;
    // Variable encargada de entrelazar nuestros nodos puesto que nos guarda la posición siguiente de nuestra pila.
    private Nodo siguiente;

    //Constructor en el que inicializamos el valor de las variables.
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos (Estos nos devuelven los valores respectivos de cada atributo de la clase)
    public int getValor() {
        return valor;
    } 
    public float getValor2() {
        return valor2;
    } 
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    

    public void setValor(int valor) {
        this.valor = valor;
    }
    //Sobrecargando setter
    public void setValor(float valor2) {
        this.valor2 = valor2;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
}
