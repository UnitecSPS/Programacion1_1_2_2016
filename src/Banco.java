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
        for(int p=0;p<cuentas.length;p++){
            if(cuentas[p] != null && cuentas[p].getNumero() == n){
                return p;
            }
        }
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
        if(searchCuenta(n) == -1){
            for(int p=0; p < cuentas.length; p++){
                if(cuentas[p] == null){
                    cuentas[p] = new CuentaBancaria(n,no);
                    return true;
                }
            }
            System.out.println("Ya esta lleno el arreglo");
        }
        else{
            System.out.println("Numero Repetido");
        }
        
        return false;
    }
    
    /**
     * 1- Buscar que esa cuenta con ese numero exista
     * 2- Si existe, depositan ese monto a esa cuenta
     * @param n Numero de la Cuenta
     * @param m Monto a depositar
     */
    public void depositarEnCuenta(int n, double m){
        int pos = searchCuenta(n);
        if(pos >= 0){
            cuentas[pos].depositar(m);
        }
    }
    
    /**
     * 1- Buscar que esa cuenta con ese numero exista
     * 2- Si existe, se intenta retirar.
     * 3- Se retorna true si pude retirar o no
     * @param n Numero de la Cuenta
     * @param m Monto a retirar
     * @return true si pude retirar o no
     */
    public boolean retirarEnCuenta(int n, double m){
        return false;
    }
    
    /**
     * 1- Buscar que la cuenta de origen y la de destino existan
     * 2- Si puedo retirar de la cuenta de origen, deposito en la
     *  cuenta de destino
     * @param no Numero de la Cuenta de Origen
     * @param nd Numero de la cuenta de Destino
     * @param m Monto a transferir
     * @return true si pude transferir o no
     */
    public boolean transferir(int no, int nd, double m){
        return false;
    }
}
