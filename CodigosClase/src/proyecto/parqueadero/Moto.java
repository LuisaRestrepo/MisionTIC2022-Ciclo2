
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
        double  diff= hoy.getTime()-super.ingreso.getTime();
        long tiempoTranscurrido = TimeUnit.MILLISECONDS.toMinutes((long) diff);

        //double tiempoTranscurrido = (hoy.getTime()-super.ingreso.getTime())/60000;
        double precioTotal = tiempoTranscurrido * precio;
        return "La Moto de placa "+super.placa+", lleva "+tiempoTranscurrido+" minutos, TOTAL PAGAR:"+precioTotal+"$";
    }
    
}
