package proyecto.biblioteca;

import proyecto.biblioteca.modelo.Material;
import java.util.ArrayList;

public class Biblioteca {

//    //Atributos
//    public static ArrayList<Material> libros;
//    private static int cantidadLibros = 0;
//    private static int secuenciaID = 0;
//
//    public static void setSecuenciaID(int secuenciaID) {
//        Biblioteca.secuenciaID = secuenciaID;
//    }
//
//    //Constructor
//    public Biblioteca() {
//        libros = new ArrayList<Material>();
//        //Material m1 = new Material(secuenciaID,"Fausto","FR32","Fausto",2000);
//        //libros.add(m1);
//        libros.add(new Material(secuenciaID, "Fausto", "FR32", "Fausto", 2000));
//        secuenciaID++;
//        cantidadLibros++;
//    }
//
//    public void agregar(String t, String c, String a, int anio) {
//        Material m = new Material(secuenciaID, t, c, a, anio);
//        libros.add(m);
//        secuenciaID++;
//        cantidadLibros++;
//    }
//
//    public static Object[][] listar() {
//        Object[][] tabla = new Object[libros.size()][5];
//
//        int contador = 0;
//        for (Material i : libros) {
//            tabla[contador][0] = i.getId();
//            tabla[contador][1] = i.getTitulo();
//            tabla[contador][2] = i.getCodigo();
//            tabla[contador][3] = i.getAutor();
//            tabla[contador][4] = i.getAnio();
//            contador++;
//        }
//        return tabla;
//    }
//
//    public Object[][] obtenerPorId(int id) {
//        Object[][] tabla = new Object[1][5];
//        for (Material i : libros) {
//            if (i.getId() == id) {
//                tabla[0][0] = i.getId();
//                tabla[0][1] = i.getTitulo();
//                tabla[0][2] = i.getCodigo();
//                tabla[0][3] = i.getAutor();
//                tabla[0][4] = i.getAnio();
//            }
//        }
//        return tabla;
//    }
//
//    public void modificar(int id, String t, String c, String a, int anio) {
//        for (Material i : libros) {
//            if (i.getId() == id) {
//                i.setTitulo(t);
//                i.setCodigo(c);
//                i.setAutor(a);
//                i.setAnio(anio);
//            }
//        }
//    }
//
//    public void eliminar(int id) {
//        for (Material i : libros) {
//            if (i.getId() == id) {
//                libros.remove(i);
//                cantidadLibros--;
//                break;
//            }
//        }
//    }

}
