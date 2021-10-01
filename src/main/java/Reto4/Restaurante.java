/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;

import java.util.Scanner;
import Reto4.Bienvenida;
import Reto4.Platos;
import Reto4.Plato;


/**
 *
 * @author Vladimir
 */
public class Restaurante {
    
    public static Scanner entrada = new Scanner(System.in);
    // bienvenida
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      
        //objeto a llamar de clases
        //Bienvenida.Bienvenida1();
        Platos.TipodePlatos();
        
        
        System.out.println("Por favor ingrese su nombre de su plato");//Se pide un dato al usuario
        String nombrePlato = entrada.nextLine();
        System.out.println("precio por plato");//Se pide otro dato al usuario
        int preciouno = entrada.nextInt();
        Plato plato = new Plato(String nombrePlatouno,String preciouno)
    }
   
        

    
    }
    

