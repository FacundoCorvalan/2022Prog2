
package seleccionDeFutbol;

import java.time.LocalDateTime;


public class Futbolista extends Persona{
    String posicion, pie;
    int cantGoles;
    
    public Futbolista(String n,String a,int nroP, LocalDateTime f, String pos,String pie,int cant){
        super(n, a, nroP, f);
        this.posicion = pos;
        this.pie = pie;
        this.cantGoles = cant;
    }

    public String getPosicion() {
        return posicion;
    }


    public String getPie() {
        return pie;
    }


    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    
    
}
