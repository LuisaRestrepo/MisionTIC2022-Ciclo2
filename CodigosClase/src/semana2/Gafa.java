
package semana2;

public class Gafa {

    private String nombre;
    private double precio;

    public Gafa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double precioConIva() {
        double iva = 0.19;
        double total = this.precio + (this.precio * iva);
        return total;
    }

    public double precioConIvaEnvio() {
        double iva = 0.19;
        double envio = 2000;
        double total = this.precio + (this.precio * iva) + envio;
        return total;
    }

}
