
package semana1;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        System.out.println("Usuario ingrese su nombre:");
        nombre = entrada.next();
        System.out.println("Usuario ingrese su apellido:");
        String apellido = entrada.next();
        System.out.println(nombre + " " + apellido);
        
        System.out.println("Usuario ingrese su cédula:");
        int cedula = Integer.parseInt(entrada.next());
        Double.parseDouble("3.1416");
        int x = (int) 9.78;
        int a = Integer.valueOf("0");//Objeto integer
        System.out.println(x);
        
        System.out.println("Usuario ingrese su la base:");
        int base = entrada.nextInt();
        System.out.println("Usuario ingrese su la altura:");
        int altura = entrada.nextInt();
        System.out.println("El área es: "+ base * altura);
        
        
    }  
}
