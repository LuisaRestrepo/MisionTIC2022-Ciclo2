
package semana2;

public class Circulo {
    
   //Atributos
   private double radio; 

   //Métodos
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getPerimetro(){
       return 2 * Math.PI * this.radio; 
    }
    
   
   
}
