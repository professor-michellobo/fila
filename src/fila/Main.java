/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fila;

/**
 *
 * @author Michel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<Integer>();
        
        fila.insere(1);
        fila.insere(2);
        System.out.println(fila.remove());
        
        // TODO code application logic here
    }
    
}
