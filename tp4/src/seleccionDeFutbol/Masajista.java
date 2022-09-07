
package seleccionDeFutbol;

import java.time.LocalDateTime;


public class Masajista extends Persona{
    private String titulo;
    private int aniosExp;
    
    public Masajista(String n, String a, int nroP, LocalDateTime f, String t, int exp){
        super(n, a, nroP, f);
        this.titulo = t;
        this.aniosExp = exp;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAniosExp() {
        return aniosExp;
    }
    
    
}
