
package semana2;

public class Gafa {

    public String nombre;
    private double precio;
    public final static double IVA = 0.19;
    public static int ENVIO = 2000;
    public static int contador = 0;


    public Gafa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        contador++;
    }

    public double precioConIva() {
        //double iva = 0.19;
        double total = this.precio + (this.precio * Gafa.IVA);
        return total;
    }

    public double precioConIvaEnvio() {
        //double iva = 0.19;
        //double envio = 2000;
        double total = this.precio + (this.precio * Gafa.IVA) + Gafa.ENVIO;
        return total;
    }
    
    public static void imprimirDatos(){
        System.out.println("IVA "+Gafa.IVA);
        System.out.println("ENVIO "+Gafa.ENVIO);
    }
    
    public double getPrecio(){
        return this.precio;
    }

}
