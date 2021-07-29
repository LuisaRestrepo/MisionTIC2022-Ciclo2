
package semana3;


public class PrincipalHerencia {
    
    public static void main(String[] args) {
        Persona p2 = new Persona();
        Persona p1 = new Persona("Camila");
        Empleado e1 = new Empleado();
        e1.nombre = "lUISA";
        e1.setNombre("Ana");
        e1.setEmpresa("Claro");
        System.out.println(e1.getEmpresa());
        System.out.println(e1.getNombre());
        System.out.println(e1.toString());
        
        EmpleadoAsalariado ea1 = new EmpleadoAsalariado();
        ea1.setNombre("German");
        ea1.setEmpresa("Ecopetrol");
        ea1.setSalario(2000);
        System.out.println(ea1.toString());
        
        
        Persona persona1 = new Empleado();
        persona1.setNombre("Luisa");
        //persona1.setEmpresa("Hola");
        
        
        Empleado temp = (Empleado) persona1;
        temp.setEmpresa("MinTIC");
        System.out.println(temp.toString());
        
        Persona persona2 = new EmpleadoAsalariado();
        EmpleadoAsalariado eaa1 = (EmpleadoAsalariado) persona2;
        eaa1.setNombre("a");
        eaa1.setEmpresa("b");
        eaa1.setSalario(0);
        System.out.println(eaa1.toString());
        
    }
    
}
