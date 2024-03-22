/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpaulico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author emanu
 */
public class Baraja {
    
    private List<Cartas> naipes;
    
    
    
    public Baraja()
            
    {
        
         naipes = new ArrayList<>();
         int j = 0;
         String [] palos = {"oro ","copa", "basto","espada"};
         while(j < 5){
              for (int i= 1; i<= 12; i++) {
                if (i!= 8 && i!= 9) {
                    naipes.add(new Cartas(i,palos[j]));
                    if (i == 12)
                    {
                        j++;
                    }
                }
                 
        
               }
         }
    }
    
    
    
}
