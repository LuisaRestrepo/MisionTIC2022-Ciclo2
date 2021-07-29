
package semana3;

public class FiguraGeometrica {
    private int lado;

    public FiguraGeometrica(int lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
    double a = Math.pow(lado, 2);
    return a;
    }
    
}
