package clase.pkg1.dados.p1;



public class MainJuego1 {
    public static void main(String [] args){
        Juego1 jj = new Juego1();
        System.out.println(jj.getPuntosJugador1());
        System.out.println(jj.getPuntosJugador2());
        
  
        
        
        System.out.println("Jugar");
        System.out.println(jj.jugar());
        
        System.out.println(jj.getPuntosJugador1());
        System.out.println(jj.getPuntosJugador2());
    }
}
