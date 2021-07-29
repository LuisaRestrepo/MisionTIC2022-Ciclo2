package semana3;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(int lado) {
        super(lado);
    }

    public double calcularArea() {
        double a = Math.sqrt(3.0)/4.0*super.calcularArea();
        return a;
    }

}
