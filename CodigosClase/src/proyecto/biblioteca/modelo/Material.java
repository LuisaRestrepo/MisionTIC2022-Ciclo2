package proyecto.biblioteca.modelo;

import java.util.ArrayList;
import proyecto.biblioteca.modelo.AutoresE;

public class Material {

    //Atributos
    private int id;
    private String titulo;
    private String codigo;
    private ArrayList<AutoresE> autores;
    private int anio;
    private int IDCategoria;
    private int IDBiblioteca;
    //public static int contador = 1;

    //Constructor
    public Material(int id, String titulo, String codigo, ArrayList<AutoresE> autores, int anio, int IDCategoria, int IDBiblioteca) {
        this.id = id;
        this.titulo = titulo;
        this.codigo = codigo;
        this.autores = autores;
        this.anio = anio;
        this.IDCategoria = IDCategoria;
        this.IDBiblioteca = IDBiblioteca;
    }

    public Material(String titulo, String codigo, ArrayList<AutoresE> autores, int anio, int IDCategoria, int IDBiblioteca) {

        this.titulo = titulo;
        this.codigo = codigo;
        this.autores = autores;
        this.anio = anio;
        this.IDCategoria = IDCategoria;
        this.IDBiblioteca = IDBiblioteca;
    }

    //Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<AutoresE> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<AutoresE> autores) {
        this.autores = autores;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public int getIDBiblioteca() {
        return IDBiblioteca;
    }

    public void setIDBiblioteca(int IDBiblioteca) {
        this.IDBiblioteca = IDBiblioteca;
    }

}
