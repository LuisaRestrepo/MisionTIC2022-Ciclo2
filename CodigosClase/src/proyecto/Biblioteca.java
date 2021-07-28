
package proyecto;

import java.util.ArrayList;


public class Biblioteca {
    
    //Atributos
    private static ArrayList<Material> libros;
    private int cantidadLibros = 0;
    private static int secuenciaID = 0;
    
    //Constructor
    public Biblioteca(){
     libros = new ArrayList<Material>();
     //Material m1 = new Material(secuenciaID,"Fausto","FR32","Fausto",2000);
     //libros.add(m1);
     libros.add(new Material(secuenciaID,"Fausto","FR32","Fausto",2000));
     secuenciaID++;
    }
    
}
    
    

