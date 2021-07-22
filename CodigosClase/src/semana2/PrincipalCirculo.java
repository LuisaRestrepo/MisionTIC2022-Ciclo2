
package semana2;

public class PrincipalCirculo {
    public static void main(String[] args) {
        Circulo circulo1;
        circulo1 = new Circulo();
        
        Circulo circulo2 = new Circulo();
        
        Circulo circulo3 = new Circulo(5);
        
        Circulo circulo4 = new Circulo(5,5);
        System.out.println("radio circulo 4: "+ circulo4.getRadio());
        
        System.out.println("radio circulo 1 antes cambiar: "+ circulo1.getRadio());
        circulo1.setRadio(9);
        circulo2.setRadio(2);
        
        //circulo1.radio = 6; //Error el atributo es privado
        System.out.println("radio circulo 1: "+ circulo1.getRadio());
        System.out.println("perimetro circulo 1: "+ circulo1.getPerimetro());
    }
}
