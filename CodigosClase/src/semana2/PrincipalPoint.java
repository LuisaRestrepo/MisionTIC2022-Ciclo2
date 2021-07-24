
package semana2;


public class PrincipalPoint {
    public static void main(String[] args) {
       Point p1 = new Point(2,1);
       Point p2 = new Point(4,3);
       
       Point p3 = new Point(5);
       Point p4 = new Point(1,2);
       
       //p1.setX(2);
       //p1.setY(1);
       
       double resultado = p1.distance(p2.getX(),p2.getY());
       double resultado3 = p1.distance(p2);
       
       double resultado4 = p1.distance(3,4);
       System.out.println("Resultado p1: "+resultado);
       System.out.println("Resultado p1 objeto: "+resultado3);
       System.out.println("Resultado p1 int: "+resultado4);
       
       
       double resultado2 = p3.distance(p4.getX(),p4.getY());
       Point midP = p1.midPoint(p2);
       System.out.println("Resultado midP: "+midP);
       System.out.println("Resultado midP toSring(): "+midP.toString());
       System.out.println("Resultado midPx: "+midP.getX());
       System.out.println("Resultado midPy: "+midP.getY());
          
   
       System.out.println("Resultado: "+resultado);
       double dist = Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
       System.out.println(dist);
       double dist2 = Math.sqrt(Math.pow(p3.getX()-p4.getX(),2)+Math.pow(p3.getY()-p4.getY(),2));       
    }
 
}
