
package clase.pkg1.dados.p1;


public class Juego2 {
    private Jugador jugador1;
    private Jugador jugador2;
    private int cantRondas;
    private int minimoPuntos;
    private Dado d1;
    private Dado d2;
    
    
    public Juego2(String n1, String n2, int cantRondas, int minimoPuntos, int cantCaras){
        jugador1 = new Jugador(n1);
        jugador2 = new Jugador(n2);
        this.cantRondas = cantRondas;
        this.minimoPuntos = minimoPuntos;
        d1 = new Dado(cantCaras);
        d2 = new Dado(cantCaras);
    }
}
