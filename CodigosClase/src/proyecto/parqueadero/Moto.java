
package proyecto.parqueadero;

import java.util.Date;


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
        double tiempoTranscurrido = (hoy.getTime()-super.ingreso.getTime())/36000000;
        double precioTotal = tiempoTranscurrido * precio;
        return "La Moto de placa "+super.placa+", lleva "+tiempoTranscurrido+" minutos, TOTAL PAGAR:"+precioTotal+"$";
    }
    
}
