
package semana2;

public class PrincipalCirculo {
    public static void main(String[] args) {
        Circulo circulo1;
        circulo1 = new Circulo();
        
        Circulo circulo2 = new Circulo();
        
        circulo1.setRadio(9);
        circulo2.setRadio(2);
        
        //circulo1.radio = 6; //Error el atributo es privado
        System.out.println("radio circulo 1: "+ circulo1.getRadio());
        System.out.println("perimetro circulo 1: "+ circulo1.getPerimetro());
    }
}
