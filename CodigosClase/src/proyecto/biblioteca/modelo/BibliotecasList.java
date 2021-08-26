
package proyecto.biblioteca.modelo;
import proyecto.biblioteca.modelo.Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import proyecto.biblioteca.modelo.*;


public class BibliotecasList {
    
    public static ArrayList<bibliotecaE> getBibliotecas() throws SQLException{
        Connection con = Conexion.getConexion();
        String query = "SELECT idbibliotecas,nombre from bibliotecas";
        PreparedStatement ps = con.prepareStatement(query);
        
        ResultSet resultado = ps.executeQuery();

        ArrayList<bibliotecaE> data = new ArrayList<bibliotecaE>();
        while(resultado.next()){
            //System.out.println("--------------");
            //System.out.println(resultado.getInt(1));       
            //System.out.println(resultado.getString(2));
            data.add(new bibliotecaE(resultado.getInt(1),resultado.getString(2)));
        }
        con.close(); 
        //System.out.println(data.toString());
        return data;
    
    }
    
    public static void main(String[] args) throws SQLException {
        getBibliotecas();
    }
}
