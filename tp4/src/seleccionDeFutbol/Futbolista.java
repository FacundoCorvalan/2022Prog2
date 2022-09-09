
package seleccionDeFutbol;

import java.time.LocalDate;



public class Futbolista extends Persona{
    String posicion, pie;
    int cantGoles;
    
    public Futbolista(String n,String a,int nroP, LocalDate f, String pos,String pie,int cant){
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
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() +
                "\nPosicion: "+this.getPosicion()+
                "\n"+this.getPie()+
                "\nCant Goles: "+this.getCantGoles();
    }
}
