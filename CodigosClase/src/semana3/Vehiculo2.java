package semana3;

import javax.lang.model.SourceVersion;

public class Vehiculo2 {

    public double velocidad = 5.0;

    public void info() {
        System.out.println("Velocidad " + this.velocidad);
    }

    public static void main(String[] args) {
        Cohete c1 = new Cohete();
        c1.info();
    }

}

class Aereo2 extends Vehiculo2 {}

class Cohete extends Aereo2 {

    public double velocidad = 25000.0;

    public void info() {
        System.out.println("Velocidad " + this.velocidad);
        System.out.println("Velocidad " + super.velocidad);
    }
}
