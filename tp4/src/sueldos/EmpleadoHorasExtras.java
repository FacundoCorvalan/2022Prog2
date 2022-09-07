
package sueldos;


public class EmpleadoHorasExtras extends Empleado{
    private int hsExtra;
    public EmpleadoHorasExtras(String nombre,int salario, int hsExtras){
        super(nombre, salario,hsExtras);
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
