
package semana3;


public class PrincipalVehiculoMaritimoBuque {
    
    public static void main(String[] args) {
        Maritimo m1 = new Maritimo("Canela",9000);
        Maritimo m2 = new Maritimo("Ozzy",8000);
        
        Buque b1 = new Buque("Titanic",2000);
        Buque b2 = new Buque("Perla",3000);
        
        //System.out.println("m1 "+m1.getPrecio());
        //System.out.println("m2 "+m2.getPrecio());
        System.out.println("b1 "+b1.getPrecio());
        System.out.println("b2 "+b2.getPrecio());
    }
    
}
