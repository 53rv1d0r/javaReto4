/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;
import java.util.Scanner;
//import static Reto4.Restaurante.entrada;

/**
 *
 * @author Vladimir
 */


public class Bienvenida {
    
    
    
    public static Scanner entrada = new Scanner(System.in);
   
    //objeto
          
    public static void Bienvenida1 () {
  
    
    String si = "si";
    String no = "no";
        
        
        while (si.equals("si")) { 
        System.out.println("Puedo tomar su orden?");
        System.out.println("(si | no)");
        String sii = entrada.next();
        if (si.equalsIgnoreCase(sii)) {
        System.out.println("Bienvenido " +"su respuesta es "+si);
        System.out.println("Porfavor elija su menú ");
        break;
        
        }
        
        else {
            
            String noo = entrada.next();
            if(no.equalsIgnoreCase(noo)){
                System.out.println("su respuesta es "+no);
                System.out.println("Gracias vuelva pronto ");
                break;
            }
                
        
        }
        System.out.println("Repita la respuesta para tomar su orden");
        }
    }
   
}
