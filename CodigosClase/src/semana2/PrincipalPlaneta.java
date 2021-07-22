/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author USUARIO
 */
public class PrincipalPlaneta {

    public static void main(String[] args) {
        Planeta planeta1 = new Planeta();
        Planeta planeta2 = new Planeta("Tierra", 5000);
        Planeta planeta3;
        planeta3 = new Planeta();

        planeta1.setNombre("Marte");
        System.out.println(planeta1.setMasa(-8));
        System.out.println(planeta1.getMasa());
    }
}
