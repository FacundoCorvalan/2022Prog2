
package Paquete1;


public class Juego {
    private int cantTotal;
    Jugador j1;
    Jugador j2;

    Cubilete c;
    
    public Juego(int cr,Jugador j1,Jugador j2,int cd,int cc){
        this.cantTotal = cr;
        this.j1=j1;
        this.j2=j2;
        this.c = new Cubilete(cd, cc);
    }
    
    

    
    
    public String getGanador(){
        if(puntos1>puntos2){
            return "Jugador 1";
        }else if(puntos2 > puntos1){
            return "Jugador 2";
        }else{
            return null;
        }
    }
    
    
    public void jugar(){
        int v1,v2;

        for (int i = 0; i < this.cantTotal; i++) {
            
            v1=j1.tirar(c);
            v2=j2.tirar(c);
            
            if(v1>=7 && v1>v2){
                j1.inc();
            }else if(v2>=7 && v2>v1){
                j2.inc();
            }

        }
        
        String g = getGanador();
        if(g!=null){
            System.out.println("Gano "+ g);
        }else{
            System.out.println("Empate");
        }
    }
    
    
}
