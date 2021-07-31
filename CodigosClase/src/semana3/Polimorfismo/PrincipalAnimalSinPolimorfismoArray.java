
package semana3.Polimorfismo;

import java.util.ArrayList;


public class PrincipalAnimalSinPolimorfismoArray {
    public static void main(String[] args) {
        Gato g1 = new Gato("Ozzy");
        Gato g2 = new Gato("Jackie");
        Gato g3 = new Gato("Michi");
        Perro p1 = new Perro("Trosqui");
        Perro p2 = new Perro("Firulais");
        Perro p3 = new Perro("Galaxia");
        
        ArrayList<Gato> gatitos = new ArrayList<Gato>();
        gatitos.add(g1);
        gatitos.add(g2);
        gatitos.add(g3);
        
        ArrayList<Perro> perritos = new ArrayList<Perro>();
        perritos.add(p1);
        perritos.add(p2);
        perritos.add(p3);
        
        sonidosGatos(gatitos);
          
    }
    
    public static void sonidosGatos(ArrayList<Gato> gatitos){
        for(Gato i: gatitos){
            System.out.println(i.getNombre()+ " sonido ");
            i.sonido();
        }
    }
    
    public static void sonidosPerros(ArrayList<Perro> perritos){
        for(Perro i: perritos){
            System.out.println(i.getNombre()+ " sonido ");
            i.sonido();
        }
    }
}
