package semana3;

public class Perro extends Animal{

    public Perro(String nombre) {
        this.setNombre(nombre);
    }

    public void sonido() {
        System.out.println("Guau Guau");
    }

}
