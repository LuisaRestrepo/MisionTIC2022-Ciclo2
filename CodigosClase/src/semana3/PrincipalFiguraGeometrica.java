
package semana3;

public class PrincipalFiguraGeometrica {
    
    public static void main(String[] args) {
        FiguraGeometrica f1;
        
        
//        f1 = new FiguraGeometrica(4);
//        System.out.println(f1.calcularArea());
        
        FiguraGeometrica f2 = new Triangulo(4);
        System.out.println(f2.calcularArea());
        //Triangulo t1 = new FiguraGeometrica(); Error, FG no hereda de TRIANGULO
    }
    
}
