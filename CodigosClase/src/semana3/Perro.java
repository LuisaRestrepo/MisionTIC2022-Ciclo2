package semana3;

public class Perro extends AnimalAbstracta{

    public Perro(String nombre) {
        this.setNombre(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("Guau Guau");
    }

}
