
package proyecto.parqueadero;

import java.util.Date;


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
        double tiempoTranscurrido = (hoy.getTime()-super.ingreso.getTime())/36000000;
        double precioTotal = tiempoTranscurrido * precio;
        return "El Carro de placa "+super.placa+", lleva "+tiempoTranscurrido+" minutos, TOTAL PAGAR:"+precioTotal+"$";
    }
    
}
