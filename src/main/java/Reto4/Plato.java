/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;

/**
 *
 * @author Vladimir
 */
public class Plato {
    

    String nombrePlatouno;
    String preciouno;
     static void main(String nombrePlatouno,String preciouno)
    {
        this.nombrePlato=nombrePlatouno;
        this.precio=preciouno;
    }
    
    public String get nombrePlato() {// esto es para poder obtener el nombre del plato 
        return nombrePlatouno;
    }
    public String set nombrePlato(String plato) {
//esto es para poder asignar desde fuera el nombre del plato 
        this.nombrePlato=nombrePlatouno;
    }
}
    
    

