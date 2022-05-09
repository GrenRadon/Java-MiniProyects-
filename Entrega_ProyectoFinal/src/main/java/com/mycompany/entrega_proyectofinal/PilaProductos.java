
package com.mycompany.entrega_proyectofinal;

/**
 *
 * @author Julián Villamizar
 */
public class PilaProductos {
    // Puntero que indica el inicio de la pila o tambein conocida como el
    // tope de la pila.
    private NodoProductos inicio;
    // Variable para registrar el tamaño de la pila.
    private int tamanio;
    /**
     * Constructor por defecto.
     */
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
    /**
     * Consulta si la pila esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la pila.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    /**
     * Agrega un nuevo nodo a la pila.
     * @param nombreProducto
     * @param nacionalidadProducto
     * @param cantidadProducto
     * @param Nit
     * @param precio
     */
    public void apilarProductos(String nombreProducto,String nacionalidadProducto,int cantidadProducto,int Nit,float precio){
        // Define un nuevo nodo.
        NodoProductos nuevo = new NodoProductos();
        // Agrega al valor al nodo.
        nuevo.setnombreProducto(nombreProducto);
        nuevo.setnacionalidadProducto(nacionalidadProducto);
        nuevo.setcantidadProducto(cantidadProducto);
        nuevo.setNit(Nit);
        nuevo.setprecio(precio);
        // Consulta si la pila esta vacia.
        if (esVacia()) {
            // Inicializa la pila con el nuevo valor.
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamanio++;
    } 
    
    public void listar(){
        // Crea una copia de la pila.
        NodoProductos aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("|\t"+"Nombre producto: "+ aux.getnombreProducto()+" Nacionalidad: "+aux.getnacionalidadProducto()+" Cantidad: "+aux.getcantidadProducto()+" Nit: "+aux.getNit()+" Precio: "+aux.getprecio()+"\t|");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            aux = aux.getSiguiente();
        }
    }

}
