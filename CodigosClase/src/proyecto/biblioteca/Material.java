
package proyecto.biblioteca;


public class Material {
    //Atributos
    private int id;
    private String titulo;
    private String codigo;
    private String autor;
    private int anio;
    //public static int contador = 1;
    
    //Constructor
    public Material(int id, String t,String c, String a, int anio){
        this.id = id;
        this.titulo = t;
        this.codigo = c;
        this.autor = a;
        this.anio = anio;
        //contador++;
    }
    
    //Métodos
    public int getId(){
        return this.id;
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public String getTitulo(){
        return this.titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public String toString(){
     return "Material - "+this.id + ", "+ this. titulo +", "+ this.codigo+", "+ this.autor +", "+ this.anio;
    }
    
    
}
