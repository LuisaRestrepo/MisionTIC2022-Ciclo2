/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author USUARIO
 */
public class PrincipalGafa {
    
    public static void main(String[] args) {
        
        System.out.println(Gafa.ENVIO);
        System.out.println(Gafa.IVA);
        //Gafa.IVA = 0.2; Error es una constante
        Gafa.ENVIO = 4000;
        Gafa.imprimirDatos();
        
        //System.out.println(Gafa.nombre); Error: no es un atributo de clase
        
        Gafa g1 = new Gafa("Rayban",5000);
        System.out.println(g1.nombre);
        System.out.println(g1.precioConIva());
        Gafa g2 = new Gafa("Antonio banderas",3000);
        

    }
    
}
