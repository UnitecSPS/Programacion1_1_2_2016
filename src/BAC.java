/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class BAC {
    public static void main(String[] args) {
        Banco banco = new Banco("BAC-Credomatic",100);
        Banco.aumentarVersion();
        System.out.println("Version: "+Banco.VERSION_BANCARIA);

        //agreguen unas cuantas cuentas
        banco.printCuentas();
        
        
    }
}
