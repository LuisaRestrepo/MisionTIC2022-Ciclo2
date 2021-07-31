/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.Polimorfismo;

public class PrincipalAnimalConPolimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        //AnimalAbstracta a2 = new AnimalAbstracta(); // Es abstracta
        
        Gato g1 = new Gato("Ozzy");
        Gato g2 = new Gato("Jackie");
        Gato g3 = new Gato("Michi");
        Perro p1 = new Perro("Trosqui");
        Perro p2 = new Perro("Firulais");
        Perro p3 = new Perro("Galaxia");
        Conejo c1 = new Conejo("Pelusa");
        
        AnimalAbstracta[] animales = {g1,g2,g3,p1,p2,p3,c1}; 
        
        sonidosAnimales(animales);
    }
    
    public static void sonidosAnimales(AnimalAbstracta[] arreglo){
        for(AnimalAbstracta i: arreglo){
            System.out.println(i.getNombre()+ " sonido ");
            i.sonido();
        }
    }
    
}
