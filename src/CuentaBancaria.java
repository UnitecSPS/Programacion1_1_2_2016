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
    
    public void depositar(double s){
        if(s < 0)
            return;
        saldo += s;
    }
    
    /**
     * Deduce del saldo el monto enviado
     * si el saldo es >= que dicho monto
     * @param m El monto a deducir
     * @return true si lo pude reducir o false si no.
     */
    public boolean retirar(double m){
        if(saldo >= m){
            saldo -= m;
            return true;
        }
        return false;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void print(){
        System.out.println(numero+"-"+nombre+"-"+saldo);
    }
    
}
