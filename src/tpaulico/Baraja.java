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
        
    public Baraja(){  
         naipes = new ArrayList<>();
         int j = 0;
         String [] palos = {"oro ","copa", "basto","espada"};
         while(j < 5){
              for (int i= 1; i<= 12; i++) {
                  naipes.add(new Cartas(j,"oro"));
                  naipes.add(new Cartas(j,"copa"));
                  naipes.add(new Cartas(j,"espada"));
                  naipes.add(new Cartas(j,"basto"));
                if (i!= 8 && i!= 9) {
                    naipes.add(new Cartas(i,palos[j]));
                    if (i == 12)
                    {
                        j++;
                    }
                }
                 //Metodo para Barajar cartas
                 Collections.shuffle(naipes);
        
               }
           }
    }
      public void barajar(){
                  Collections.shuffle(naipes);
              }
      
      public Cartas siguienteCarta() {
        if (naipes.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        } else {
            return naipes.remove(0);
        }
      }
    
      public int cartasDisponibles(){
          return naipes.size();
      }
    
}
