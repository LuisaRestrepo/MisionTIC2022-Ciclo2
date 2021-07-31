

package semana3.Polimorfismo;


public class PrincipalAnimalSinPolimorfismo {
    
    public static void main(String[] args) {
        Gato g1 = new Gato("Ozzy");
        Gato g2 = new Gato("Jackie");
        Gato g3 = new Gato("Michi");
        Perro p1 = new Perro("Trosqui");
        Perro p2 = new Perro("Firulais");
        Perro p3 = new Perro("Galaxia");
        
        Gato[] gatitos = {g1,g2,g3};
        Perro[] perritos = {p1,p2,p3};
        
        Gato[] gatitos2 = new Gato[3];
        gatitos2[0] = g1;
                
        sonidosGatos(gatitos);
        sonidosPerros(perritos);
       
    }
    
    public static void sonidosGatos(Gato[] gatitos){
        for(Gato i: gatitos){
            System.out.println(i.getNombre()+ " sonido ");
            i.sonido();
        }
    }
    
    public static void sonidosPerros(Perro[] perritos){
        for(Perro i: perritos){
            System.out.println(i.getNombre()+ " sonido ");
            i.sonido();
        }
    }
    
}
