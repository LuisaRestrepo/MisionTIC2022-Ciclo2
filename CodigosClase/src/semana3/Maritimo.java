
package semana3;


public class Maritimo extends Vehiculo3{
    public static final double IVA = 0.2;

    public Maritimo(String n, double p) {
        super(n, p);
    }
    
    @Override
    public double getPrecio(){
     return super.getPrecio()+(super.getPrecio() *  IVA);
    }
}
