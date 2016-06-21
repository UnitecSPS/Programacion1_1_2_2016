/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Aula
 */
public class EmailAccount {
    private String direccion, nombre;
    private Email inbox[];

    public EmailAccount(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
        inbox = new Email[100];
    }
    
    public boolean recibirEmail(Email em){
        for(int p=0; p < 100; p++){
            if(inbox[p] == null){
                inbox[p] = em;
                return true;
            }
        }
        return false;
    }
    
    public void printInbox(){
        int cr=0, csl=0;
        
        for(int p=0; p < 100; p++){
            if(inbox[p] != null){
                cr++;
                System.out.print((p+1)+"-"+inbox[p].getFrom()+
                        "-"+inbox[p].getSubject());
                if(inbox[p].isLeido()){
                    System.out.println("-LEIDO");
                    csl++;
                }
                else{
                    System.out.println("-NO LEIDO");
                }
            }
        }
        System.out.println("R: "+cr+" CSL: "+csl);
    }
    
    public void leerEmail(int pos){
        if(inbox[pos-1] != null){
            inbox[pos-1].print();
            inbox[pos-1].leido();
        }
        else{
            System.out.println("Correo No existe");
        }
    }
    
    public void borrarLeidos(){
        for(int p=0; p < 100; p++){
            if(inbox[p] != null && inbox[p].isLeido()){
                inbox[p] = null;
            }
        }
    }
    
    public static void main(String[] args) {
        EmailAccount ea = new EmailAccount("test@java.com", "Carlos");
        Email em = new Email("t@t.com","hola","Bye");
        
        if(ea.recibirEmail(em)){
            System.out.println("Se recibio Email");
        }
        else{
            System.out.println("No se pudo recibir");
        }
    }
}
