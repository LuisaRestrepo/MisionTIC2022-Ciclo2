package semana3.Polimorfismo;

public abstract class AnimalAbstracta {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void sonido();
    
}
