/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILALINEAL;

import java.util.ArrayList;

/**
 *
 * @author ASHLEY
 */
public class pilalineal {
    
    private static final int INICIAL = 19;
    private int cima;
    private ArrayList arraylistapila;

    public pilalineal() {
        cima = -1;
        arraylistapila = new ArrayList();
    }

    public void insertarElemento(Object elemento) throws Exception {
        cima++;
        arraylistapila.add(elemento);
    }

    public Object quitarCima() throws Exception {
        Object auxiliar;
        if (pilaVacia()) {
            throw new Exception("ESTA VACIA LA PILA!");
        }
        auxiliar = arraylistapila.get(cima);
        arraylistapila.remove(cima);
        cima--;
        return auxiliar;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("ESTA VACIA LA PILA ");
        }
        return arraylistapila.get(cima);
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitarCima();
        }

    }
    
}
