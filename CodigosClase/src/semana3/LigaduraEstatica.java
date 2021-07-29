
package semana3;


public class LigaduraEstatica {
    public static void main(String[] args) {
        Persona2 p1 = new Empleado2();
        Empleado2 e1 = new Empleado2();
        
        Persona2.hola();
        Empleado2.hola();
        
        p1.info(); // ligadura dinamica
        p1.hola(); // ligadura estatica
        
        System.out.println("Variable x "+p1.x); //Atributos-ligadura estatica
        
        
    }
}

class Empleado2 extends Persona2{
    int x = 3;
    public static void hola(){
        System.out.println("Hola s desde empleado");
    }
    
    public void info(){
        System.out.println("Hola desde empleado");
    }
}

class Persona2{
    int x = 2;
    public static void hola(){
        System.out.println("Hola s desde persona");
    }
    
    public void info(){
        System.out.println("Hola desde persona");
    }

}
