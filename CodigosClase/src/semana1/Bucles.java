package semana1;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        //estructuraWhileCentinela();
        //estructuraDoWhile();
        estructuraFor();
    }

    public static void estructuraWhile() {
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i += 1; // i = i +1;
        }
    }

    public static void estructuraWhileCentinela() {
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese un número");
//        int num = entrada.nextInt();
//
//        //int i = 0;
//        while (num > 0) {
//            System.out.println("Hola");
//            System.out.println("o ingrese cero para salir");
//            num = entrada.nextInt();
//        }

        System.out.println("Ingrese un número");
        int num2 = entrada.nextInt();
        int contador = 0;
        while (num2 != 0) {
            contador = contador + num2;
            System.out.println("Contador" + contador);
            System.out.println("Ingrese un número");
            num2 = entrada.nextInt();
        }

    }
    
    public static void estructuraDoWhile() {
//      int i = 11;
//      do{
//          System.out.println(i);
//          i++;
//      }while(i<11);
      
      
      Scanner entrada = new Scanner(System.in);
      int contador = 0;
      int num2;
        do {
            System.out.println("Ingrese un número");
            num2 = entrada.nextInt();
            contador = contador + num2;
            System.out.println("Contador" + contador);
        }while (num2 != 0);
    }
    
    public static void estructuraFor() {
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Bienvenido");
        }
        
        int contador = 0;
        for(int num2 = entrada.nextInt();num2 != 0;num2 = entrada.nextInt()){
            contador = contador + num2;
            System.out.println("Contador" + contador);
            System.out.println("Ingrese un número");
        }
//        
        for(int i = 20; i > 1; i-=2){
            System.out.println(i);
        }
        
        for (int i= 20; i>1; i--){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }

}
