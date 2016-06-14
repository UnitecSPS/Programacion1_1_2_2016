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
        CuentaBancaria cb3 = null;
        
        
        if(cb != null){
            System.out.println("CB tiene espacio de memoria");
        }
        
        if(cb3 == null){
            System.out.println("Cb3 NO tiene un espacio de memoria");
        }
        
        System.out.println(cb.getSaldo());
        
        //depositen
        double monto = -562.9;
        cb.depositar(monto);
        
        //retiren
        if(cb.retirar(300)){
            System.out.println("Se retiro");
        }
        
        //imprimir la cuenta
        cb.print();
        
        String n = cb2.getNombre();
        System.out.println("Imprimiendo a "+n);
        cb2.print();
        
    }
}
