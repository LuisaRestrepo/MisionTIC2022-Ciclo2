
package proyecto.parqueadero;

import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Moto extends Vehiculo{
    
    public static int precio;

    public Moto(String p) {
        super(p);
    }

    @Override
    public String info(){
        return "MOTO - "+ super.info();
    }

    @Override
    public String pago() {
        Date hoy = new Date();

        long diff = hoy.getTime()-super.ingreso.getTime();
        long diffSeconds = diff / 1000;
        double precioTotal = diffSeconds * (precio/60);

        return "La Moto de placa "+super.placa+", lleva "+Math.round(diffSeconds/60.0)+" minutos, TOTAL PAGAR:"+precioTotal+"$";
    }
    
}
