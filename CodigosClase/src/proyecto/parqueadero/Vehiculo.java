package proyecto.parqueadero;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Vehiculo {

    public String placa;
    public Date ingreso;
    public final static String PATTERN = "yyyy-MM-dd HH:mm";

    public Vehiculo(String p) {
        this.placa = p;
        this.ingreso = new Date();
    }

    public String info() { 
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN);
        String date = simpleDateFormat.format(this.ingreso);
        return "Placa: " + this.placa + ", Fecha de ingreso: " + date;
    }

    public abstract String pago();
}
