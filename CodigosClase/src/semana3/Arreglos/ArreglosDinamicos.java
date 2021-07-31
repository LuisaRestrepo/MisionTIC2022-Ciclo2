
package semana3.Arreglos;

import java.util.ArrayList;

public class ArreglosDinamicos {
    public static void main(String[] args) {
        ArrayList<Integer> edades = new ArrayList<Integer>();
        
        edades.add(18);
        edades.add(24);
        edades.add(13);
        
        System.out.println(edades.get(1));
        System.out.println(edades.get(2));
        //System.out.println(edades.get(3));
        
        edades.set(2, 45);
        System.out.println(edades.get(2));
        
        System.out.println("Tamaño: "+edades.size());
        
        edades.remove(1);
        
        System.out.println(edades.toString());
        
        for(Integer i: edades){           
            System.out.println(i);           
        }
        
        System.out.println("Posición 45: "+edades.indexOf(45));
        
        Integer[] objects = edades.toArray(new Integer[0]);
        
  
    }
 
}
