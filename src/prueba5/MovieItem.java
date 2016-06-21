/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba5;

/**
 *
 * @author Aula
 */
public class MovieItem {
    private String nombre;
    private boolean estreno;
    
    public MovieItem(String n){
        nombre = n;
        estreno = true;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstreno() {
        return estreno;
    }
    
    public int rent(int dias){
        int diff=0;
        
        if(estreno){
            if(dias > 3){
                diff = dias - 3;
            }
        }
        else{
            if(dias > 5){
                diff = dias - 5;
            }
        }
        
        return 60 + (10*diff);
    }
    
    public static void main(String[] args) {
        MovieItem mo = new MovieItem("Titanic");
        System.out.println(mo.rent(3));
    }
    
}
