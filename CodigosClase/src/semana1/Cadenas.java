
package semana1;

public class Cadenas {
    public static void main(String[] args) {
       String mensaje = "Bienvenido a Java!";
       String mensaje2 = "bienvenido a java!";
       
       System.out.println("Substring "+mensaje.substring(0,10));
       System.out.println("Substring "+mensaje.substring(10));
       System.out.println(mensaje.substring(10).toUpperCase());
       
       System.out.println("Equals "+mensaje.equals(mensaje2));
       System.out.println("EqualsIgnoreCase "+mensaje.equalsIgnoreCase(mensaje2));
       
       int ultimaPosicion=  mensaje.length() -1;
       System.out.println("Longitud: "+mensaje.length());
       System.out.println("ChartAt: "+mensaje.charAt(ultimaPosicion));
       
        System.out.println("Index a: "+mensaje.indexOf("a"));
        System.out.println("Index x: "+mensaje.indexOf("x"));
        System.out.println("Index nido: "+mensaje.indexOf("nido"));
        String mensajeMayuscula = mensaje.toUpperCase();
        System.out.println(mensajeMayuscula);
        System.out.println("Index NIDO: "+mensajeMayuscula.indexOf("NIDO"));
        System.out.println("Index a después de 11: "+mensaje.indexOf("a",12)); //Busca después de ese índice, es inclusivo
        
        
        System.out.println("LastIndex a: "+mensaje.lastIndexOf("a"));
        System.out.println("LastIndex a, antes 13: "+mensaje.lastIndexOf("a",13));//Busca antes de ese índice, inclusivo
        System.out.println("LastIndex a, antes 10: "+mensaje.lastIndexOf("a",10));
        System.out.println("LastIndex en: "+mensaje.lastIndexOf("en"));
       
       
//       boolean z = (mensaje == mensaje2);
//       System.out.println(z);
       
//       String s1="Sachin";  
//       String s2="Sachin";  
//       String s3=new String("Sachin");  
//       System.out.println(s1==s2);//true (because both refer to same instance)  
//       System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
//
//       int num1 = 2;
//       int num2 = 3;
//       
//       String str1 = "num1+num2 =";
//       String str2 = "=num1+num2";
//       System.out.println(str1+ num1 + num2);
//       System.out.println(num1 + num2 + str2);
//       System.out.println(str1+ (num1 + num2));
       
       
    }
}
