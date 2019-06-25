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
    private Character raiz;
    private ArbolBinario derecho;

    
    public ArbolBinario() {
    }

 //  ADT ARBOL BINARIO DESDE AQUI EN ADELANTE   
    
    public static ArbolBinario ABvacio(){
        ArbolBinario AB=new ArbolBinario();
        return AB;
    }
    
    public static boolean esABvacio(ArbolBinario AB){
    return AB.raiz==null && AB.izquierdo==null && AB.derecho==null;
    }
    
    
    public static ArbolBinario armarAB(ArbolBinario izq,Character raiz,ArbolBinario der){
        ArbolBinario nuevoAB=new ArbolBinario();
        nuevoAB.setItem(raiz);
        nuevoAB.setIzquierdo(izq);
        nuevoAB.setDerecho(der);
        return nuevoAB;
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
    
    public static boolean Pertenece(ArbolBinario AB,Character raiz){
        if(esABvacio(AB)){
            return false;
        }else{
            if(AB.getItem()==raiz){
                return true;
            }else{
              return (Pertenece(AB.getIzquierdo(),raiz) || Pertenece(AB.getDerecho(),raiz)); 
            }
        }
    }
    
    
    /////////////////////////////////////////////////////////////////
    
    public ArbolBinario getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(ArbolBinario izquierdo) {
        this.izquierdo = izquierdo;
    }

    public char getItem() {
        return raiz;
    }

    public void setItem(Character raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario getDerecho() {
        return derecho;
    }

    public void setDerecho(ArbolBinario derecho) {
        this.derecho = derecho;
    }
    
    

 
    
    
    
}
