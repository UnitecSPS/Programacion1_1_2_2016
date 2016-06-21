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
public class Email {
    private String from, subject, contenido;
    private boolean leido;

    public Email(String from, String subject, String contenido) {
        this.from = from;
        this.subject = subject;
        this.contenido = contenido;
        leido = false;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isLeido() {
        return leido;
    }
    
    public void leido(){
        leido = true;
    }
    
    public void print(){
        System.out.println("De: "+from);
        System.out.println("Asunto: "+subject);
        System.out.println(contenido);
    }
}
