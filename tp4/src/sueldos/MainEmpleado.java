
package sueldos;


public class MainEmpleado {
    public static void mai(String[] args) {
        EmpleadoContratado e1 = new EmpleadoContratado("contratado", 100);
        EmpleadoHorasExtras e2 = new EmpleadoHorasExtras("Horas extra", 100, 5);
        EmpleadoComision e3 = new EmpleadoComision("Comision", 100, 9);
        
        
        e1.mostrarDatosEmpleado();
        e2.mostrarDatosEmpleado();
        e3.mostrarDatosEmpleado();
    }
}
