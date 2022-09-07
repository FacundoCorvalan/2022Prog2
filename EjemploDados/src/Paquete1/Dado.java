
package Paquete1;


public class Dado {
    private int valor;
    int cantCaras;
    public Dado(int cantCaras){
        valor = 1;
        this.cantCaras = cantCaras;
    }
    
    public int tirar(){
       this.valor = (int)((Math.random()*this.cantCaras)+1);
       return valor;
    }
}
