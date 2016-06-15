/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcianos;

/**
 *
 * @author Aula
 */
public class Marciano {
    public String nombre;
    public static int cuantos=0;
    
    public Marciano(String nombre) {
        this.nombre = nombre;
        cuantos++;
    }
    
    public void atacar(){
        if(cuantos >= 5){
            System.out.println("Yo "+nombre+" Estoy listo para atacar!");
        }
        else{
            System.out.println("Yo "+nombre+" mejor me espero..."+
                    "Es que solo hay "+cuantos+" marciano(s)");
        }
    }
    
    
}
