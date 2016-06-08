/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Potencia {
    /*
    Atributos publicos: 3 doubles llamados: base, expo, pot
    Constructor: Que reciba de parametro 2 valores double
        uno se lo asignamos a base y el otro al expo.
        y luego con la ayuda de la funcion Math.pow(base,expo)
        guardo la potencia resultante en el atributo pot
    
    Aqui mismo hacer un main para probar dicha clase. Pueden
    utilizar valores hardcoded.
    */
    public double base, expo, pot;
    
    public Potencia(double b, double e){
        base = b;
        expo = e;
        pot = Math.pow(base, expo);
    }
    
    public static void main(String[] args) {
        //creamos un obj
        Potencia po = new Potencia(3,5);
        System.out.println(po.base+"^"+po.expo+"="+po.pot);
    }
}
