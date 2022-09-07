
package sueldos;


public class EmpleadoContratado extends Empleado{
    
    public EmpleadoContratado(String n, double s){
        super(n, s, 0);
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
