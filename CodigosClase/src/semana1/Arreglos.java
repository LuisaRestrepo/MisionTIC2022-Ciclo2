package semana1;

import java.util.*;

public class Arreglos {

    public static void main(String[] args) {
        int[] edades = new int[5];
        String[] nombres = new String[10];

        System.out.println(edades[2]);
        System.out.println(nombres[2]);
        //System.out.println(nombres[10]);//Error posición fuera del arreglo

        nombres[2] = "Laura";

        for (String i : nombres) {
            System.out.println("Arreglo nombres" + i);
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo nombres 2" + nombres[i]);
        }

        for (String i : nombres) {
            i = "hola";
            System.out.println(i);
        }

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "hola";
            System.out.println("Arreglo nombres 2" + nombres[i]);
        }

        String[] nombres2 = {"ana", "luisa"};

        for (int i = 0; i < nombres2.length; i++) {
            String texto = nombres2[i];
            int pFinal = texto.length() - 1;
            String nombreInverso = "";
            for (int n = pFinal; n >= 0; n--) {
                char l = texto.charAt(n);
                nombreInverso = nombreInverso + l;
            }
            System.out.println(nombreInverso);
            if (texto.equals(nombreInverso)) {
                System.out.println("Es un palindromo");
            }
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();
        int[] arreglo_usr = new int[num];
        System.out.println("Arreglo de " + num + " posiciones");
        for (int i = 0; i < arreglo_usr.length; i++) {
            System.out.println(arreglo_usr[i] = 5);
        }

        int[][] arreglo = new int[4][5];
        arreglo[1][1] = 5;
    }
}
