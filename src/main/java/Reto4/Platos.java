/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;

import java.util.Scanner;
import Reto4.Plato;

/**
 *
 * @author Vladimir
 */
public class Platos {
   String platoDesayuno;
   String AgnolottidelPli;
  
    public static Scanner entrada = new Scanner(System.in);
    
      
       
  
       
    public static void TipodePlatos () {
        String platoDesayuno;
        String platoAlmuerzo;
        String platoComida;
        int  i ;
      
       
        System.out.println ("Seleccione el tipo de menú: ");
        System.out.println ("1. Plato de Desayuno\n 2. Plato de Almuerzo\n 3. Plato de Comida ");
        i = entrada.nextInt();
    
    //i!=1 and i!=2 and i!=3
    while(i==i){
        
         
        if ((i>=1)||(i<=3)){
          
       
        if (i==1){
            platoDesayuno = " Plato de Desayuno"; 
            
            System.out.println ("Selecciono:" +i+ "\n"+ platoDesayuno);
            
            
            break;
            
        }
        if (i==2){
            platoAlmuerzo = " Plato de Almuerzo"; 
            System.out.println ("Selecciono:" +i+ "\n"+ platoAlmuerzo);
            break;
        }
        if (i==3){
            platoComida = " Plato de Comida"; 
            System.out.println ("Selecciono:" +i+ "\n"+ platoComida);
            break;
        }
     
   }
        else{
            
        }
       
        System.out.println("Aún no selecciona un tipo de comida");
        
        break;
         }
   
}
    

    public Platos(String platoDesayuno) {
        this.platoDesayuno = platoDesayuno;
        System.out.println ("Selecciono:" +1+ "\n"+ platoDesayuno);
    }

    public static void main(String[] args) {
        
        
    }
   
     
   
    
    }
   
    
   
       
    
   
     
    
     
 
    
    

