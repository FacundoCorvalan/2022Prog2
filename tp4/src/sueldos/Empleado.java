
package sueldos;


public class Empleado {
    private String nombreEmpleado;
    private double salarioFijo;
    private int extra;
    public Empleado(String nombre,double salario,int extra){
        this.nombreEmpleado = nombre;
        this.salarioFijo = salario;
        this.extra = extra;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double calcularSalario(){
        return this.salarioFijo + this.extra;
    }

    
    
    
    
    public void mostrarDatosEmpleado(){
        System.out.println("El empleado "+this.getNombreEmpleado()+"cobrara $"+this.calcularSalario());
    }
    
    
}
