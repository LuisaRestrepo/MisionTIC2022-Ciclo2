
package semana2;


public class Planeta {
    private String nombre;
    private float masa;

    public Planeta() {
        this.masa = 4000;
    }

    public Planeta(String nombre, float masa) {
        this.nombre = nombre;
        this.masa = masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMasa() {
        return masa;
    }

    public String setMasa(float masa) {
        String mensaje= "";
        if(masa > 0){
            this.masa = masa;
            mensaje = "Cambio realizado";
        }else{
            mensaje = "Valor inválido";
        }
        return mensaje;

    } 
}
