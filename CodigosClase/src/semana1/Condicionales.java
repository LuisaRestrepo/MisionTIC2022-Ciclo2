
package semana1;
import java.util.Scanner;

public class Condicionales {
    
    public static void main(String[] args) {
     //estructuraElseIf();
     estructuraSwitch();
    }
    
    public static void estructuraIfThen() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese temperatura");
        int temp = entrada.nextInt();
        
        if(temp > 27){
            System.out.println("Comprar helado-cerveza");
        }
        System.out.println("Fin programa");
    }
    
    public static void estructuraIfThenElse() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los créditos aprobados");
        int creditos = entrada.nextInt();
        if(creditos >= 120){
            System.out.println("Graduado");
        }else{
            System.out.println("No se gradúa");
        }
        System.out.println("Fin programa");
    }
    
    public static void estructuraIfAnidado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese temperatura");
        int temp = entrada.nextInt();
        System.out.println("Ingrese dinero");
        int dinero = entrada.nextInt();
        
        if(temp > 27){
            if(dinero > 5){
                System.out.println("Comprar helado-cerveza");
            }
        }
        System.out.println("Fin programa");
        
        if(temp > 27 && dinero > 5){
                System.out.println("Comprar helado-cerveza");
        }
        System.out.println("Fin programa");
    }
    
    public static void estructuraElseIf() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese temperatura");
        int temp = entrada.nextInt();
        
        if(temp > 27){
            System.out.println("Comprar helado-cerveza");
        }else if(temp > 24){
            System.out.println("Comprar gaseosa");
        }else{
            System.out.println("Comprar leche");
        }        
        System.out.println("Fin programa");
    }
    
    public static void estructuraSwitch() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nota");
        int nota = entrada.nextInt();
        
        switch(nota){
            case 10:
                System.out.println("Teso");
                break;
            case 9:
                System.out.println("Tesito");
                break;
            case 8:
                System.out.println("Vas bien");
                break;
            default:
                System.out.println("Puedes mejorar");
        }
        
        int x = 2;
        int y = 5;
        System.out.println("Ingrese Opcion \n 1 Suma \n 2 Resta \n 3 Multiplicacion \n 4 Division");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break; 
            default:
                System.out.println("Opción desconocida");
        }
    }
    
}
