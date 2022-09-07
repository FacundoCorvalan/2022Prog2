
package Paquete1;


public class DadoCargado extends Dado{
    private int valorCargado;
    public DadoCargado(int c,int valor){
        super(c);
        this.valorCargado = valor;
    }
    
    
    @Override
    public int tirar(){
        if(Math.random()>0.5){
            return this.valorCargado;
        }else{
            return super.tirar();
        }
    }






}
