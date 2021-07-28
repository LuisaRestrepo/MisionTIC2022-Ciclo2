
package semana3;


public class Persona {
    protected String nombre;
    
    public Persona(){
    }
    
    public Persona(String n){
      this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
