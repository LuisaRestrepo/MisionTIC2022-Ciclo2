
package proyecto.biblioteca;

import proyecto.biblioteca.controlador.LoginControlador;
import proyecto.biblioteca.modelo.Usuario;
import proyecto.biblioteca.vista.BibliotecaLogin;


public class Main {
    public static void main(String[] args) {
        BibliotecaLogin vista = new BibliotecaLogin();
        Usuario modelo = new Usuario();
        
        LoginControlador controlador = new LoginControlador(vista, modelo);
        controlador.start();
    }
}
