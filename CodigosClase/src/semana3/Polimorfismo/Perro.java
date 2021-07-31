package semana3.Polimorfismo;

public class Perro extends AnimalAbstracta{

    public Perro(String nombre) {
        this.setNombre(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("Guau Guau");
    }

}
