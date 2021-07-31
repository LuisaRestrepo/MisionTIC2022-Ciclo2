
package semana3.Polimorfismo;


public class Animal {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void sonido(){
        System.out.println("No tiene sonido");
    }
}
