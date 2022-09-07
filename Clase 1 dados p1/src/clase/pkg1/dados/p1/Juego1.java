
package clase.pkg1.dados.p1;


public class Juego1 {
    private int puntosJugador1;
    private int puntosJugador2;
    private int minimoPuntos;
    private int cantCaras;
    private int cantRondas;
    
    public Juego1(int minimoPuntos, int cantCaras, int cantRondas){
        this.minimoPuntos = minimoPuntos;
        this.cantCaras = cantCaras;
        this.cantRondas = cantRondas;
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
    }
    public Juego1(int minimoPuntos){
        this.minimoPuntos = minimoPuntos;
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
        
    }
    
    public Juego1( int cantCaras, int cantRondas){
        this(7,cantCaras, cantRondas); 
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
    }
    
    
    public Juego1(){//Llama al segundo constructor asignando un minimoPuntos = 7 
        this(7);
    }
    
    
    
    public int getPuntosJugador1() {
        return puntosJugador1;
    }

    public int getPuntosJugador2() {
        return puntosJugador2;
    }
    
    private int tirarDado(){
        return (int) ((Math.random())*cantCaras)+1;
        
    }
    
    public String ganador(){
        if (puntosJugador1>puntosJugador2) {
            return "Jugador1";
            
        }else if (puntosJugador2>puntosJugador1) {
            return "Jugador 2";
        }else{
            return "Empate";
        }
    }
    
    public String jugar(){
        int puntos1;
        int puntos2;
        for(int i=0;i<cantRondas;i++){
            puntos1 = this.tirarDado() + this.tirarDado();
            puntos2 = this.tirarDado() + this.tirarDado();
            if ((puntos1>=minimoPuntos)&&(puntos1>puntos2)){
                puntosJugador1++; 
            }else if ((puntos2>=minimoPuntos)&&(puntos2>puntos1)) {
                puntosJugador2++;
            }
        }
        return this.ganador();
    }
}
