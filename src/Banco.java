/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Banco {
    public static int VERSION_BANCARIA=1;
    private String nombre;
    private CuentaBancaria cuentas[];
    
    public Banco(String n, int max){
        nombre = n;
        cuentas = new CuentaBancaria[max];
    }
    
    public static void aumentarVersion(){
        VERSION_BANCARIA++;
        //getNombre();
    }

    public String getNombre() {
        //VERSION_BANCARIA++;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void printCuentas(){
        for(CuentaBancaria cb : cuentas){
            if(cb!=null){
                cb.print();
            }
        }
    }
    
    /**
     * Busca una CuentaBancaria en el arreglo cuyo numero
     * coincida con el parametro n
     * @param n Numero de cuenta a buscar
     * @return la posicion en el arreglo de esa cuenta bancaria, sino
     *  existe retornan -1
     */
    public int searchCuenta(int n){
        return -1;
    }
    
    /**
     * Intenta agregar una nueva cuenta bancaria al arreglo
     * SI hay posiciones disponibles.
     * VALIDEN que el numero de la cuenta a crear no este
     * repetido
     * @param n Numero de la cuenta
     * @param no Nombre del cuenta
     * @return true si lo pude guardar o false si no
     */
    public boolean addCuenta(int n,String no){
        return false;
    }
}
