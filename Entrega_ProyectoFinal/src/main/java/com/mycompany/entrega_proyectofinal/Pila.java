
package com.mycompany.entrega_proyectofinal;

/**
 *
 * @author Julián Villamizar
 */
public class Pila {
    // Puntero que indica el inicio de la pila o tambein conocida como el
    // tope de la pila.
    private Nodo inicio;
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
     * @param valor a agregar.
     */
    public void apilar(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
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
    /**
     * Agrega un nuevo nodo a la pila.
     * @param valor a agregar.
     */
    public void apilar(float valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
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
    
    /**
     * Elimina el elemento que se encuentra en el tope de la pila.
     */
    public void retirar(){
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            inicio = inicio.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            tamanio--;
        }
    }
    /**
     * Consulta el valor del nodo que se encuentra en la cima de la pila
     * @return valor del nodo.
     * @throws Exception 
     */
    public int cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    /**Sobrecarga para floats
     * Consulta el valor del nodo que se encuentra en la cima de la pila
     * @return valor del nodo.
     * @throws Exception 
     */
    public float cima2() throws Exception{
        if(!esVacia()){
            return inicio.getValor2();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    /**
     * Busca un elemento en la pila.
     * @param referencia valor del nodo a buscar.
     * @return true si el valor de referencia existe en la pila.
     */
    public boolean buscar(int referencia){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Bandera para verificar si existe el elemento a buscar.
        boolean existe = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(existe != true && aux != null){
            // Compara si el valor del nodo es igual que al de referencia.
            if (referencia == aux.getValor()) {
                // Cambia el valor de la bandera.
                existe = true;
            }
            else{
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el valor de la bandera.
        return existe;
    }
    /**Sobrecarga para floats
     * Busca un elemento en la pila.
     * @param referencia valor del nodo a buscar.
     * @return true si el valor de referencia existe en la pila.
     */
    public boolean buscar(float referencia){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Bandera para verificar si existe el elemento a buscar.
        boolean existe = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(existe != true && aux != null){
            // Compara si el valor del nodo es igual que al de referencia.
            if (referencia == aux.getValor2()) {
                // Cambia el valor de la bandera.
                existe = true;
            }
            else{
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el valor de la bandera.
        return existe;
    }
    
    /**
     * Revisa todos los elementos de la pila.
     * @return retorna la sumatoria de horas semanales.
     */
    public int sumatoriaHorasPorSemanaEmpleado(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Bandera para verificar si existe el elemento a buscar.
        int contador=0;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(aux != null){
            contador += aux.getValor();
            aux = aux.getSiguiente();
        }
        return contador;
    }
    
    /**
     * Revisa todos los elementos de la pila.
     * @return retorna la sumatoria de horas semanales.
     */
    public float sumatoriaNotasEstudiantes(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Bandera para verificar si existe el elemento a buscar.
        float contador=0;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(aux != null){
            contador += aux.getValor2();
            aux = aux.getSiguiente();
        }
        return contador;
    }
    
    public void listar(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
    /**Para floats
     * Despliega en pantalla los elementos de la pìla.
     */
    public void listar2(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getValor2() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}
