package proyecto.biblioteca.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.biblioteca.modelo.Usuario;
import static proyecto.biblioteca.modelo.Usuario.obtenerPerfil;
import static proyecto.biblioteca.modelo.Usuario.validarSesion;
import proyecto.biblioteca.vista.BibliotecaGUI;
import proyecto.biblioteca.vista.BibliotecaLogin;
import proyecto.biblioteca.vista.BibliotecaRegistro;

public class LoginControlador implements ActionListener {

    private Usuario modelo;
    private BibliotecaLogin vista;

    public LoginControlador(BibliotecaLogin vista, Usuario modelo) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.ingresar.addActionListener(this);
        this.vista.registro.addActionListener(this);
        this.vista.mostrar.addActionListener(this);
    }

    public void start() {
        this.vista.setVisible(true);
        this.vista.getContentPane().setBackground(Color.WHITE);
        this.vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Ingresar a la biblioteca":
                String user = this.vista.usuario.getText();
                String pass = new String(this.vista.contrasena.getPassword());

                try {
                    if (this.modelo.validarSesion(user, pass)) {
                        JOptionPane.showMessageDialog(vista, "Logueo exitoso");
                        this.vista.usuario.setText("");
                        this.vista.contrasena.setText("");
                        new BibliotecaControlador(modelo.obtenerPerfil(user));
                        //new BibliotecaGUI().setVisible(true);
                        this.vista.setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(vista, "Usuario y/o contraseña inválido");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BibliotecaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "Registro":
            try {
                new BibliotecaRegistro().setVisible(true);
                this.vista.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(BibliotecaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case "Mostrar contraseña":
                if (this.vista.mostrar.isSelected()) {
                    this.vista.contrasena.setEchoChar((char) 0);
                } else {
                    this.vista.contrasena.setEchoChar('*');
                }
                break;
        }
    }

}
