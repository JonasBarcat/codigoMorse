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
        
           ArbolBinario vacio=ArbolBinario.ABvacio(' ');// nodos vacios ultimo nivel
           
        

         
        
        //nivel 5
        ArbolBinario cero=ArbolBinario.ABvacio('0');
        ArbolBinario uno=ArbolBinario.ABvacio('1');
        ArbolBinario dos=ArbolBinario.ABvacio('2');
        ArbolBinario tres=ArbolBinario.ABvacio('3');
        ArbolBinario cuatro=ArbolBinario.ABvacio('4');
        ArbolBinario cinco=ArbolBinario.ABvacio('5');
        ArbolBinario seis=ArbolBinario.ABvacio('6');
        ArbolBinario siete=ArbolBinario.ABvacio('7');
        ArbolBinario ocho=ArbolBinario.ABvacio('8');
        ArbolBinario nueve=ArbolBinario.ABvacio('9');
        ArbolBinario suma=ArbolBinario.ABvacio('+');
        ArbolBinario igual=ArbolBinario.ABvacio('=');
        ArbolBinario division=ArbolBinario.ABvacio('/');
     
        //nivel 4
        ArbolBinario H=ArbolBinario.armarAB(cinco, 'H',cuatro);
        ArbolBinario V=ArbolBinario.armarAB(vacio, 'V',tres);
        ArbolBinario F=ArbolBinario.armarAB(vacio, 'F',vacio);
        ArbolBinario vacio1=ArbolBinario.armarAB(vacio, ' ', dos);
        
        ArbolBinario L=ArbolBinario.armarAB(vacio, 'L',vacio);
        ArbolBinario vacio2=ArbolBinario.armarAB(suma,' ',vacio);
        ArbolBinario P=ArbolBinario.armarAB(vacio, 'P',vacio);
        ArbolBinario J=ArbolBinario.armarAB(vacio, 'J',uno);
        
        ArbolBinario B=ArbolBinario.armarAB(seis, 'B',igual);
        ArbolBinario X=ArbolBinario.armarAB(division, 'X',vacio);
        ArbolBinario C=ArbolBinario.armarAB(vacio, 'C',vacio);
        ArbolBinario Y=ArbolBinario.armarAB(vacio, 'Y',vacio);
        
        ArbolBinario Z=ArbolBinario.armarAB(siete, 'Z',vacio);
        ArbolBinario Q=ArbolBinario.armarAB(vacio, 'Q',vacio);
        ArbolBinario vacio3=ArbolBinario.armarAB(ocho,' ',vacio);
        ArbolBinario vacio4=ArbolBinario.armarAB(nueve,' ', cero);
        
        
        //nivel 3
        ArbolBinario S=ArbolBinario.armarAB(H, 'S',V);
        ArbolBinario U=ArbolBinario.armarAB(F, 'U',vacio1);
        ArbolBinario R=ArbolBinario.armarAB(L, 'R',vacio2);
        ArbolBinario W=ArbolBinario.armarAB(P, 'W',J);
        ArbolBinario D=ArbolBinario.armarAB(B, 'D',X);
        ArbolBinario K=ArbolBinario.armarAB(C, 'K',Y);
        ArbolBinario G=ArbolBinario.armarAB(Z, 'G',Q);
        ArbolBinario O=ArbolBinario.armarAB(vacio3, 'O',vacio4);
        
        //nivel 2
        ArbolBinario I=ArbolBinario.armarAB(S, 'I',U);
        ArbolBinario A=ArbolBinario.armarAB(R, 'A',W);
        ArbolBinario N=ArbolBinario.armarAB(D, 'N',K);
        ArbolBinario M=ArbolBinario.armarAB(G, 'M',O);
        
        //nivel 1
        ArbolBinario E=ArbolBinario.armarAB(I, 'E',A);
        ArbolBinario T=ArbolBinario.armarAB(N, 'T',M);
        
        //raiz
        ArbolBinario start=ArbolBinario.armarAB(E, '_',T);
        
    }
    
    
    
    
    
}
