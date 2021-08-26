
package calculadora.controlador;

import calculadora.modelo.CalculadoraModelo;
import calculadora.vista.CalculadoraVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculadoraControlador implements ActionListener {
    
    private CalculadoraVista vista;
    private CalculadoraModelo modelo;

    CalculadoraControlador(CalculadoraVista vista, CalculadoraModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.calcular.addActionListener(this);
    }
    
    public void iniciar(){
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumeroUno( Double.parseDouble(vista.var1.getText()));
        modelo.setNumeroDos( Double.parseDouble(vista.var2.getText()));
        modelo.multiplicar();
        vista.resultado.setText(String.valueOf(modelo.getResultado()));
    }
    
}
