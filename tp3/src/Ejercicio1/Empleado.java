
package Ejercicio1;


public class Empleado {
    private double plus;
    private int encuestasRealizadas;
    public Empleado() {
        this.plus = 0;
        this.encuestasRealizadas =0;
    }

    public void setPlus(double plus) {
        this.plus += plus;
    }

    public void setEncuestasRealizadas(int encuestasRealizadas) {
        this.encuestasRealizadas = encuestasRealizadas;
    }
    
    
    public int getEncuestasRealizadas(){
        return this.encuestasRealizadas;
    }
    
    
}
