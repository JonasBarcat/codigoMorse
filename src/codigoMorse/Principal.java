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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        ArbolBinario derecha=ArbolBinario.ABvacio('3');
        ArbolBinario izquierda=ArbolBinario.ABvacio('2');
        ArbolBinario raiz=ArbolBinario.armarAB(izquierda, '1', derecha);
        
        if(ArbolBinario.esABvacio(raiz)){
            System.out.println("Es Arbol vacio");
        }else{
            System.out.println("NO es Arbol vacio");
        }
        
        
    }
    
    
    
    
    
}
