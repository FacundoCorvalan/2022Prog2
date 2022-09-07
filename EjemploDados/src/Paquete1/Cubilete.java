
package Paquete1;


public class Cubilete {
    Dado[]dados;
    
    int cantD;
    int maxCant =dados.length;
    public Cubilete(int cantD,int cr){
        this.cantD = cantD;
        this.dados = new Dado[cantD];
        
        for (int i = 0; i < cantD; i++) {
            dados[i]=new Dado(cr);
        }
    }
    
    public int tirar(){
        int sum=0;
        for (int i = 0; i < cantD; i++) {
            sum += dados[i].tirar();
        }
        
        return sum;
    }
    
    public Dado sacarDado(){
        Dado paraSacar = this.dados[this.cantD-1];
        this.cantD--;
        return paraSacar;
    }
    
    public void agregarDado(Dado dado){
        
        if(this.cantD < this.maxCant){
            this.dados[this.cantD]=dado;
            this.cantD++;
        }
    }
}
