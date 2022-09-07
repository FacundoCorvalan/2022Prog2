
package sueldos;


public class EmpleadoComision extends Empleado{

    public EmpleadoComision(String n, double s, int h){
        super(n, s, h);
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalario();
        
    }
    
    @Override
    public void mostrarDatosEmpleado(){
        super.mostrarDatosEmpleado();
    }
}
