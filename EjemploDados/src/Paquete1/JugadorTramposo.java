
package Paquete1;


public class JugadorTramposo extends Jugador{
    private DadoCargado d1;
    
    
    public JugadorTramposo(String n,DadoCargado d){
        super(n);
        this.d1 = d;
    }
    
    public int tirar(Cubilete cubilete){
        Dado original = Cubilete.sacarDado()//metodo en Cubilete
        Cubilete.agregarDado(d1);
        int valor = super.tirar(cubilete);
        Cubilete sacarDado();
        Cubilete agregarDado(original);
        return valor
    }
}
