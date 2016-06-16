
import java.util.Scanner;

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
    private static Banco banco = new Banco("BAC-Credomatic",100);
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Banco.aumentarVersion();
        System.out.println("Version: "+Banco.VERSION_BANCARIA);

        int op;
        
        do{
            System.out.println("1- Agregar Cuenta");
            System.out.println("2- Listar Cuentas");
            System.out.println("3- Depositar en una cuenta");
            System.out.println("4- Retirar de una cuenta");
            System.out.println("5- Salir");
            System.out.print("Escoja opcion: ");
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    addCuenta();
                    break;
                case 2:
                    banco.printCuentas();
                    break;
            }
        }while(op!=5);

    }

    private static void addCuenta() {
        System.out.print("Numero: ");
        int n = lea.nextInt();
        System.out.print("Nombre: ");
        String no = lea.next();
        
        if( banco.addCuenta(n, no) ){
            System.out.println("Apertura Exitosa");
        }
        else{
            System.out.println("Apertura fallo");
        }
    }
}
