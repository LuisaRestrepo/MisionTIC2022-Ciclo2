
package proyecto.parqueadero;

import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Carro extends Vehiculo{
    
    public static int precio;

    public Carro(String p) {
        super(p);
    }
    
    @Override
    public String info(){
        return "CARRO - "+ super.info();
    }

    @Override
    public String pago() {
        Date hoy = new Date();
        long  diff= hoy.getTime()-super.ingreso.getTime();
        long diffSeconds = diff / 1000;
        double precioTotal =diffSeconds * (precio/60);
        return "El Carro de placa "+super.placa+", lleva "+diffSeconds/60.0+" minutos, TOTAL PAGAR:"+precioTotal+"$";
    }
    
}
