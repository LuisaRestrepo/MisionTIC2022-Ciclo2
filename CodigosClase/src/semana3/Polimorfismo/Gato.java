
package semana3.Polimorfismo;

public class Gato extends AnimalAbstracta{
    
 public Gato(String nombre){
     this.setNombre(nombre);
 }
 
 @Override
 public void sonido(){
     System.out.println("Miau Miau");
 }
    
}
