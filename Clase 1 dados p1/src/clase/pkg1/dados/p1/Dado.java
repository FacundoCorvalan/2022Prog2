
package clase.pkg1.dados.p1;


public class Dado {
    private int cantCaras;
    private int ultValor;
    
    public Dado(int cantCaras){
        this.cantCaras = cantCaras;
        ultValor  = this.tirar();
        
    }
    //1:05:52
    public int getCantCaras() {
        return cantCaras;
    }
    
    
    public int tirar(){
        ultValor = return (int) ((Math.random()*cantCaras)+1);
        return ultValor;
    }
    
}

