package proyecto.biblioteca.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proyecto.biblioteca.controlador.PasswordUtils;
import proyecto.biblioteca.modelo.Conexion;
import proyecto.biblioteca.modelo.bibliotecaE;

public class Usuario {

    public static void registrarUsuario(String n, String u, String p, int id) throws SQLException {

        String llave = PasswordUtils.getSalt(10);
        String clave = PasswordUtils.generateSecurePassword(p, llave);
        System.out.println(llave);
        System.out.println(clave);

        Connection con = Conexion.getConexion();
        String query = "INSERT INTO empleados (usuario, clave, llave, estado, nombre,tipo_usuario_idtipo_usuario,bibliotecas_idbibliotecas) VALUES (?,?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, u);
        ps.setString(2, clave);
        ps.setString(3, llave);
        ps.setInt(4, 1);
        ps.setString(5, n);
        ps.setInt(6, 2);
        ps.setInt(7, id);
        //System.out.println(ps.toString());
        ps.executeUpdate();
        con.close();

    }

    public static boolean validarUsuario(String usuario) throws SQLException {

        Connection con = Conexion.getConexion();
        String query = "SELECT usuario FROM empleados WHERE usuario = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, usuario);

        ResultSet data = ps.executeQuery();
        boolean bandera = data.next();

        con.close();
        return bandera;
    }

    public static boolean validarSesion(String usuario, String clave) throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT clave,llave FROM empleados WHERE usuario = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, usuario);

        ResultSet data = ps.executeQuery();

        String[] arreglo = new String[2];
        boolean bandera = false;
        if (data.next()) {
            arreglo[0] = data.getString(1);
            arreglo[1] = data.getString(2);
            bandera = PasswordUtils.verifyUserPassword(clave, arreglo[0], arreglo[1]);
            System.out.println(bandera);
            //System.out.println(data.getString(1));
            //System.out.println(data.getString(2));
        }

        return bandera;

    }

    public static int obtenerPerfil(String usuario) throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT tipo_usuario_idtipo_usuario FROM empleados WHERE usuario = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, usuario);

        ResultSet data = ps.executeQuery();
        int tipo = 0;
        if (data.next()) {
            tipo = data.getInt(1);
            System.out.println(tipo);
        }   
        return tipo;
    }

    public static void main(String[] args) throws SQLException {
        //System.out.println(validarUsuario("mintic2"));
        //validarSesion("mintic", "mintic123");
        obtenerPerfil("luisa");
    }
}
