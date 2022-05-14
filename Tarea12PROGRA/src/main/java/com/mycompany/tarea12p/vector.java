/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea12p;

import LISTAENLAZADA.enlazada;
import PILALINEAL.pilalineal;
import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 *
 * @author ASHLEY
 */
public class vector {
    
   static void arrayListPila() {
        pilalineal arrayList = new pilalineal();
        int numElementos;
       BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INGRESE EL NUMERO DE ELEMENTOS:");
        try {
            numElementos = Integer.parseInt(entrada.readLine());
            for (int i = 1; i <= numElementos; i++) {
                System.out.println("NUMERO DE ELEMENTOS." + i + ": ");
                Double numValor;
                numValor = Double.valueOf(entrada.readLine());
                arrayList.insertarElemento(numValor);
            } 
            System.out.println("LOS ELEMENTOS DE LA PILA SON :");
            while (!arrayList.pilaVacia()) {
                Double numero;
                numero = (Double) arrayList.quitarCima();
                if (numero > 0.0) {
                    System.out.println(numero);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    static void listaEnlazadaPila() {
        enlazada pila;
        int numElementos;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("NUMERO DE ELEMENTOS PARA USAR):");
        try {
            pila = new enlazada();
            do {
                numElementos = Integer.parseInt(entrada.readLine());
                pila.insertar(numElementos);
            } while (numElementos != CLAVE);

            System.out.println("Elementos de la lista  ");
            while (!pila.pilaVacia()) {
                numElementos = (Integer) (pila.quitar());
                System.out.println(numElementos + " ");
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        System.out.println("LISTA");
        arrayListPila();
        System.out.println("\nLista enlazada");
        listaEnlazadaPila();
    }
}