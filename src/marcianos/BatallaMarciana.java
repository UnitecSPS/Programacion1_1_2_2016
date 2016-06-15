/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcianos;

import java.util.Scanner;

/**
 *
 * @author Aula
 */
public class BatallaMarciana {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Marciano mars[] = new Marciano[5];
        int c=0;
        char resp;
        
        do{
            System.out.print("Nombre: ");
            mars[c++] = new Marciano(lea.next());
            
            for(Marciano mar : mars){
                if(mar!=null){
                    mar.atacar();
                }
            }
            
            System.out.println("otro?: ");
            resp = lea.next().charAt(0);
        }while(resp=='S');
    }
}
