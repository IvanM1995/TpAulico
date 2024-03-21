/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpaulico;

/**
 *
 * @author Ivan
 */
public class Cartas {
    private int numero;
    private String palo;
    
    public Cartas ( int numero, String palo){
        this.numero = numero;
        this.palo = palo;
        
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }
    
    @Override
    public String toString(){
      
      return numero +"de"+palo;
   }
 }
