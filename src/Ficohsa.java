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
        CuentaBancaria cb = new CuentaBancaria(15,"Monique");
        CuentaBancaria cb2 = new CuentaBancaria(10,"Mae");
        
        //System.out.println(cb.saldo);
        
        //depositen
        double monto = 562.9;
        cb.setSaldo(monto);
        
//        //retiren
//        monto = 300;
//        if(cb.saldo >= monto){
//            cb.saldo -= monto;
//        }
        
        //imprimir la cuenta
        cb.print();
        cb2.print();
        
    }
}
