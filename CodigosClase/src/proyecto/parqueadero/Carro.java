
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
        double  diff= hoy.getTime()-super.ingreso.getTime();
        long tiempoTranscurrido = TimeUnit.MILLISECONDS.toMinutes((long) diff);
        //double tiempoTranscurrido = (hoy.getTime()-super.ingreso.getTime())/60000;
        double precioTotal = tiempoTranscurrido * precio;
        return "El Carro de placa "+super.placa+", lleva "+tiempoTranscurrido+" minutos, TOTAL PAGAR:"+precioTotal+"$";
    }
    
}
