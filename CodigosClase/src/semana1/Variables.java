
package semana1;

class Variables {
    
    public static void main(String[] args){
        System.out.println("Hola mundo!!");
        tiposVariables();
        operadoresNumericos();
        operadoresLogicos();
    }
    
    public static void tiposVariables(){
        int edad = 5;
        double salario = 46.32;
        boolean miBooleano = true;
        String nombre = "Luisa";
       
        int x;
        x = 3;
        System.out.println("El valor de x es: "+x+", "+salario);
        System.out.printf("El valor de x  - %s, salario - %s ",x,salario);
        //var t = 3;
        
        edad = edad + 8;
        salario = 53.1;
        double total = salario + edad;
       
        int i, j, k;
        int h = 4, p = 3;
        
        String nombre2 = "Luisa";
        String apellido = "Restrepo";
        int identidad = 1231312;
        int edad2 =1;System.out.println("El valor de x es: "+x+", "+salario);
        String genero = "Femenino";
        System.out.println(nombre2+" "+apellido+" "+identidad+" "+edad2+" "+genero);   
    }
    
    public static void operadoresNumericos(){
        int a = 5;
        int b = 3;
        int c = 8;
        int d = 4;
        int e = 2;
        System.out.println( a  - b/c + (b-(c/d))/e);
        System.out.println( Math.pow(5,2));
        System.out.println( Math.sqrt(5));
    }
    
    public static void operadoresRelacionales(){
        int radio = 5;
        System.out.println(radio > 0);
        System.out.println(radio >= 0);
        System.out.println(radio < 0);
        System.out.println(radio <= 0);
        System.out.println(radio == 0);
        System.out.println(radio != 0);
    }
    
    public static void operadoresLogicos(){
        int a = 16;
        boolean b = true;
        int c = 4;
        int d = 8;
        int e = 5;
        System.out.println( a > c && e <= d);
        System.out.println(b || (d -e) > a / c);
        System.out.println(!b);
        System.out.println(!b && c < d || a/d <= e);
        System.out.println(b^false);
    }
}
