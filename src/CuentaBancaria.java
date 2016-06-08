/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class CuentaBancaria {
    private int numero;
    private String nombre;
    private double saldo;
    
    
    public CuentaBancaria(int numero, String nombre, double sal){
        System.out.println("LLAMANDO CONSTRUCTOR de 3");
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = sal;
    }
    
    public CuentaBancaria(int n, String no){
        this(n,no,0);
        System.out.println("LLAMANDO CONSTRUCTOR DE 2");
    }
    
    public void setSaldo(double s){
        saldo += s;
    }
    
    public void print(){
        System.out.println(numero+"-"+nombre+"-"+saldo);
    }
    
}
