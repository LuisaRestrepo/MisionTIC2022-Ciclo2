
package semana1;

public class HolaMundo {
    public static void main(String[] args){
        System.out.println("Hola mundo!!");
        
        String mensaje = "Bienvenido a Java";
        System.out.println(mensaje.indexOf("i"));
        System.out.println(mensaje.indexOf("nido"));
        System.out.println(mensaje.indexOf("en"));
        System.out.println(mensaje.indexOf("en",3));
        
        System.out.println(mensaje.lastIndexOf("a"));
        System.out.println(mensaje.lastIndexOf("x"));
        System.out.println(mensaje.lastIndexOf("ido"));
        System.out.println(mensaje.lastIndexOf("en",4));
    }
}
