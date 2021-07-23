/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
    import java.util.*;
/**
 *
 * @author USUARIO
 */
public class Prueba {
    


    public static int [] ordenamientoPersonalizado(){
        
        int [] vector = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
    
        
        Integer [] vectorOrdenado = new Integer [vector.length];
        
        for(int i=0; i<vector.length; i++) {
            vectorOrdenado[i] = Integer.valueOf(vector[i]);
        }
        
        Arrays.sort(vectorOrdenado,0,5);
        Arrays.sort(vectorOrdenado, 5,10, Collections.reverseOrder());
        
        int[] vectorOrdenado2 = new int[vectorOrdenado.length];
        
        for(int i=0; i<vectorOrdenado.length; i++) {
            vectorOrdenado2[i] = Integer.parseInt(vectorOrdenado[i].toString());
        }
        
        //
      
        return vectorOrdenado2;
    }

}
    

