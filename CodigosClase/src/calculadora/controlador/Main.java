
package calculadora.controlador;

import calculadora.modelo.CalculadoraModelo;
import calculadora.vista.CalculadoraVista;


public class Main {
    
    public static void main(String[] args) {
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraModelo modelo = new CalculadoraModelo();
        
        CalculadoraControlador cont = new CalculadoraControlador(vista,modelo);
        cont.iniciar();
    }
    
}
