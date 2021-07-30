
package semana3;


public class Conejo extends AnimalAbstracta{
    
     public Conejo(String nombre){
     this.setNombre(nombre);
     
 }

    @Override
    public void sonido() {
        System.out.println("Que hay de bueno viejo!");
    }
}
