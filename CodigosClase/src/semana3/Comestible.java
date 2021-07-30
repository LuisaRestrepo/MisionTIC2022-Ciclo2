
package semana3;


public interface Comestible {
    public final int VARIABLE = 1; // CONSTANTES
    public abstract String comer(); // METODOS ABSTRACTOS
    public static void imprimir(){ // METODOS STATIC
        System.out.println("imprimir");
    }
    public abstract void hola(); //
    default void metodo(){ // METODO DEFAULT - IMPLICITAMENTE ES ABSTRACT
        System.out.println("Hola");
    }
}

class Gallina extends AnimalAbstracta implements Comestible{

    @Override
    public String comer() {
        Comestible.imprimir();
        return "Comer gallinas: "+VARIABLE;   
    }
    
    @Override
    public void hola() {
        System.out.println("Hola");
    }

    @Override
    public void sonido() {
        System.out.println("Choi choi");
    }

}

