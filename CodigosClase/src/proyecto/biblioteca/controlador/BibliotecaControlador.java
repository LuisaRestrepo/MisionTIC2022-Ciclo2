package proyecto.biblioteca.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.biblioteca.modelo.BibliotecaModel;
import proyecto.biblioteca.vista.BibliotecaGUI;
import static proyecto.biblioteca.vista.BibliotecaGUI.b1;

public class BibliotecaControlador implements ActionListener {

    BibliotecaGUI vista;
    BibliotecaModel modelo;

    public BibliotecaControlador(int tipo) throws SQLException {
        this.vista = new BibliotecaGUI();
        this.modelo = new BibliotecaModel();
        this.vista.agregar.addActionListener(this);
        this.vista.modificar.addActionListener(this);
        this.vista.eliminar.addActionListener(this);
        this.vista.buscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Agregar":
                String titulo1 =  this.vista.titulo.getText();
                String codigo1 =  this.vista.codigo.getText();
                //String autor1 = autor.getText();
                int anio1 = Integer.parseInt( this.vista.anio.getText());
                //b1.agregar(titulo1, codigo1, autor1, anio1);
                JOptionPane.showMessageDialog(vista, "Libro guardado");
                //actualizarModelo();
//        data = b1.listar();
//        modelo = new DefaultTableModel(data, columnas);
//        tabla.setModel(modelo);
                this.vista.titulo.setText("");
                this.vista.codigo.setText("");
                this.vista.anio.setText("");

                break;
            case "Modificar":
                break;
            case "Eliminar":
                break;
            case "Buscar":
                break;

        }
    }

}
