
package semana2;

public class Circulo {
    
   //Atributos
   private double radio; 
   
   //Constructor 1
   public Circulo(){
     this.radio = 1;
   }
   
   //Constructor 2
   public Circulo(double r){
    this.radio = r;
   }
   
   //Constructor 3
   public Circulo(double r,double t){
    this.radio = r*t;
   }
   
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
