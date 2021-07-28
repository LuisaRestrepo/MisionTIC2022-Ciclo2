/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author USUARIO
 */
public class Cuadrado extends Figura{
    private float lado;

    public Cuadrado(String n, float l) {
        super(n);
        this.lado = l;
    }   
    @Override
    public void area(){
      super.area();
        System.out.println("Area "+ lado*lado);
    }
    
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado("Cuadrado1",5);
        c1.area();
    }
}
