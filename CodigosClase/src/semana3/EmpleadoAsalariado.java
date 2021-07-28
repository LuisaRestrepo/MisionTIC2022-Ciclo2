
package semana3;


public class EmpleadoAsalariado extends Empleado{
    private float salario;
    
    public void setSalario(float s){
        this.salario = s;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    @Override
    public String toString(){
      String texto = "Empleado Asalariado: nombre- "+getNombre()+ "\n";
      texto = texto + "Empresa: "+getEmpresa() + "\n";
      texto = texto + "Salario: "+this.salario;
      return texto;
    }
    
}
