
package seleccionDeFutbol;

import java.time.LocalDate;


public class Entrenador extends Persona {
    private int id;
    
    public Entrenador(String n,String a, int nroP, LocalDate f,int id){
        super(n, a, nroP, f);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public String mostrarDatos(){
        return super.mostrarDatos()+
                "Id de la federacion: "+this.getId();
    }
}
