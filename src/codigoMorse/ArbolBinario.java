/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoMorse;

/**
 *
 * @author jonas
 */
public class ArbolBinario {
    
    private ArbolBinario izquierdo;
    private char item;
    private ArbolBinario derecho;

    
    public ArbolBinario() {
    }
    
    public ArbolBinario(char valor) {
        this.izquierdo =null;
        this.item = valor;
        this.derecho = null;
    }

 //  ADT ARBOL BINARIO DESDE AQUI EN ADELANTE   
    
    public static ArbolBinario ABvacio(char caracter){
        ArbolBinario vacio=new ArbolBinario(caracter);
        return vacio;
    }
    
    public static boolean esABvacio(ArbolBinario AB){
    return AB==null;
    }
    
    
    public static ArbolBinario armarAB(ArbolBinario izq,char dato,ArbolBinario der){
        ArbolBinario nuevo=new ArbolBinario(dato);
        nuevo.setIzquierdo(izq);
        nuevo.setDerecho(der);
        return nuevo;
    }
    
    
    public static ArbolBinario Izquierdo(ArbolBinario AB){
        return AB.getIzquierdo();
    }
    
    public static char Raiz(ArbolBinario AB){
        return AB.getItem();
    }
    
    public static ArbolBinario Derecho(ArbolBinario AB){
        return AB.getDerecho();
    }
    
    public static boolean Pertenece(ArbolBinario AB,char dato){
        return AB.getItem()==dato;
    }
    
    
    
    
    public ArbolBinario getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(ArbolBinario izquierdo) {
        this.izquierdo = izquierdo;
    }

    public char getItem() {
        return item;
    }

    public void setItem(char item) {
        this.item = item;
    }

    public ArbolBinario getDerecho() {
        return derecho;
    }

    public void setDerecho(ArbolBinario derecho) {
        this.derecho = derecho;
    }
    
    

 
    
    
    
}
