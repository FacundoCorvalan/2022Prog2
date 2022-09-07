
package impuestos;


public class Ciudad {
    private int poblacion;
    private double imp1,imp2,imp3,imp4,imp5;
    private double gastoMantenimiento;
    private boolean deficit;
    private String nombreCiudad;

    public Ciudad(String nombre,int poblacion, double imp1, double imp2, double imp3, double imp4, double imp5, double gastoMantenimiento) {
        this.nombreCiudad = nombre;
        this.poblacion = poblacion;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gastoMantenimiento = gastoMantenimiento;
        this.deficit = this.recaudacion()<this.gastoMantenimiento;
    }
    
    public double recaudacion(){
        return imp1+imp2+imp3+imp4+imp5;
    }
    
    public String getNombreCiudad(){
        return this.nombreCiudad;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getGastoMantenimiento() {
        return gastoMantenimiento;
    }

    public boolean isDeficit() {
        return deficit;
    }
    
    
    
    
}
