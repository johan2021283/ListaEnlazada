/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1;

/**
 *
 * @author Dell Latitude 3190
 */

import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;
}

class ListaEnlazada {
    Nodo inicio;

    ListaEnlazada() {
        inicio = null;
    }

    void insertarInicio(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    void insertarFinal(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.siguiente = null;
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    void recorrer() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    boolean buscar(int dato) {
        Nodo actual = inicio;
        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }
        return actual != null;
    }

    void borrar(int dato) {
        if (inicio != null) {
            if (inicio.dato == dato) {
                inicio = inicio.siguiente;
            } else {
                Nodo actual = inicio;
                while (actual.siguiente != null && actual.siguiente.dato != dato) {
                    actual = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente = actual.siguiente.siguiente;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        while (!salir){
            System.out.println("Lista Enlazada\n");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Borrar un elemento");
            System.out.println("0. Salir\n");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el dato a insertar: ");
                    int datoInicio = scanner.nextInt();
                    lista.insertarInicio(datoInicio);
                }
                case 2 -> {
                    System.out.print("Ingrese el dato a insertar: ");
                    int datoFinal = scanner.nextInt();
                    lista.insertarFinal(datoFinal);
                }
                case 3 -> {
                    System.out.println("Elementos de la lista:");
                    lista.recorrer();
                }
                case 4 -> {
                    System.out.print("Ingrese el elemento a buscar: ");
                    int elementoBuscado = scanner.nextInt();
                    if (lista.buscar(elementoBuscado)) {
                        System.out.println("El elemento " + elementoBuscado + " está en la lista");
                    } else {
                        System.out.println("El elemento " + elementoBuscado + " no está en la lista");
                    }
                }
                case 5 -> {
                    System.out.print("Ingrese el elemento a borrar: ");
                    int elementoBorrar = scanner.nextInt();
                    lista.borrar(elementoBorrar);
                }
                case 0 -> { 
                    salir = true;
                    System.out.println("Saliendo del programa...");
                }
            }
        }
    }
}
       

        
                      
                    