/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTAENLAZADA;

/**
 *
 * @author ASHLEY
 */
public class enlazada {
    
     private Nodo cima;

    public enlazada() {
        cima = null;
    }
// METODO PARA EL ESTADO VACIO
    public boolean pilaVacia() {
        return cima == null;
    }
//INSERTAR
    public void insertar(Object elemento) {
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
//QUITAR
    public Object quitar() throws Exception {
        if (pilaVacia()) {
             throw new Exception("ESTA VACIA!");
        }
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
     //METODO PARA ACCEDER  A LA CIMA DE LA PILA
    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("No SE LEE");
        }
        return cima.elemento;
    }

    public void limpiarPila() {
        Nodo t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }

    
}
