
package seleccionDeFutbol;

import java.time.LocalDateTime;


public class Entrenador extends Persona {
    private int id;
    
    public Entrenador(String n,String a, int nroP, LocalDateTime f,int id){
        super(n, a, nroP, f);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
}
