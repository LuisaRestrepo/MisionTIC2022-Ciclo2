package proyecto.biblioteca.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BibliotecaModel {

    public static ArrayList<CategoriaE> getCategorias() throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT * from categorias";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet resultado = ps.executeQuery();

        ArrayList<CategoriaE> data = new ArrayList<CategoriaE>();
        while (resultado.next()) {
            //System.out.println("--------------");
            //System.out.println(resultado.getInt(1));       
            //System.out.println(resultado.getString(2));
            data.add(new CategoriaE(resultado.getInt(1), resultado.getString(2)));
        }
        con.close();
        //System.out.println(data.toString());
        return data;

    }

    public static ArrayList<AutoresE> getAutores() throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT * from autores";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet resultado = ps.executeQuery();

        ArrayList<AutoresE> data = new ArrayList<AutoresE>();
        while (resultado.next()) {
            //System.out.println("--------------");
            //System.out.println(resultado.getInt(1));       
            //System.out.println(resultado.getString(2));
            data.add(new AutoresE(resultado.getInt(1), resultado.getString(2)));
        }
        con.close();
        //System.out.println(data.toString());
        return data;

    }

    public static void agregarMaterial(Material m) throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "INSERT INTO materiales (`titulo`," + "`codigo`," + "`autor`," + "`anio`," + "`Categorias_idCategorias`," + "`estado`," + "`bibliotecas_idbibliotecas`) VALUES ('" + m.getTitulo() + "','" + m.getCodigo() + "', ' ','" + m.getAnio() + "','" + m.getIDCategoria() + "'," + 1 + "," + m.getIDBiblioteca() + ");";
        PreparedStatement ps = con.prepareStatement(query);
        ps.executeUpdate();

        String query2 = "SELECT MAX(IdMaterial) FROM biblioteca.materiales;";
        PreparedStatement ps2 = con.prepareStatement(query2);
        ResultSet result = ps2.executeQuery();
        int id = 0;
        if (result.next()) {
            id = result.getInt(1);
            m.setId(id);
        }

        for (AutoresE i : m.getAutores()) {
            String query3 = "INSERT INTO autores_has_materiales (`autores_idautores`," +"`materiales_idMaterial`) VALUES (" + i.getId() + "," +  m.getId()+");";
            PreparedStatement ps3 = con.prepareStatement(query3);
            ps3.executeUpdate();
        }

        con.close();
    }

}
