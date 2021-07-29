 
package semana3;


public class Buque extends Maritimo{

    public Buque(String n, double p) {
        super(n, p);
    }
  
   
  @Override
  public double getPrecio(){
      return super.getPrecio()+40;
  }   
}
