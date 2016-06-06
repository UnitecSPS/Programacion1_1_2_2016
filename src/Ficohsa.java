/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Ficohsa {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        System.out.println(cb.saldo);
        
        //op numero, nombre
        cb.numero = 1;
        cb.nombre = "carlos";
        
        //depositen
        double monto = 562.9;
        cb.saldo += monto;
        
        //retiren
        monto = 300;
        if(cb.saldo >= monto){
            cb.saldo -= monto;
        }
        
        //imprimir la cuenta
        System.out.println(cb.numero+"-"+cb.nombre+"-"+
                cb.saldo);
    }
}
