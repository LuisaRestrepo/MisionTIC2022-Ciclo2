
package proyecto.parqueadero;


public class PrincipalParqueadero {
    
    public static void main(String[] args) throws InterruptedException {
        //Vehiculo v1 = new Vehiculo("LPO987");
        //System.out.println(v1.ingreso);
        
        Carro c1 = new Carro("LPO987");
        System.out.println(c1.info());
        //Thread.sleep(10000);
        System.out.println(c1.pago());
        
        Parqueadero p1 = new Parqueadero(5,3,2000,1000);
        System.out.println(p1.imprimeVacios());
        
        System.out.println(p1.parqueaVehiculo(0, 1, 1, "HYU776"));
        System.out.println(p1.imprimeVacios());
        System.out.println(p1.parqueaVehiculo(1, 1, 2, "FRT323"));
        System.out.println("*****************");
        System.out.println(p1.estadoParqueadero());
        //System.out.println(p1.parqueaVehiculo(6, 6, 1, "HYU776"));
       
    }
    
}
