
package Paquete1;


public class Jugador {
    String nombre;
    int puntos;
    
    public Jugador(String nom){
        this.nombre = nom;
        this.puntos = 0;
        
    }
    
    public void inc(){
        this.puntos++;
    }
    
    public int getPuntos(){
        return this.puntos;
    }
    
    public int tirar(Cubilete c){
        return c.tirar();
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
