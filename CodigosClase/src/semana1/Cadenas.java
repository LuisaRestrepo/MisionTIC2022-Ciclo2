
package semana1;

public class Cadenas {
    public static void main(String[] args) {
       String mensaje = "Bienvenido a Java!";
       String mensaje2 = "Bienvenido a Java!";
       
       boolean z = (mensaje == mensaje2);
       System.out.println(z);
       
       String s1="Sachin";  
       String s2="Sachin";  
       String s3=new String("Sachin");  
       System.out.println(s1==s2);//true (because both refer to same instance)  
       System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  

       int num1 = 2;
       int num2 = 3;
       
       String str1 = "num1+num2 =";
       String str2 = "=num1+num2";
       System.out.println(str1+ num1 + num2);
       System.out.println(num1 + num2 + str2);
       System.out.println(str1+ (num1 + num2));
    }
}
