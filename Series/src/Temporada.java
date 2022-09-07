
import java.util.ArrayList;

public class Temporada {
    //Arraylist<clase> nombreArray = new Arraylist<>();
    private ArrayList<Episodio> episodios;
    private int n;
    
    public void Temporada(){
        this.episodios = new ArrayList<>();
        this.n =0;
    }
    
    
    //agregar los ep a la temporada
    public void agregarEpisodio(Episodio e){
        if(n < episodios.size()){
            episodios.add(e);
            n++;
        }
    }
    
    //● Obtener el total episodios vistos de una temporada particular. TEMP
    public int epVistos(){
        int cant=0;
        for (int i = 0; i < episodios.size(); i++) {
            if(episodios.get(i).isFlag()){
                cant++;
            }
        }
        return cant;
    }
    
    //● Obtener el promedio de las calificaciones dadas para una temporada particular. TEMP
    public double promedioCal(){
        int sumaCal=0;
        for (int i = 0; i < episodios.size(); i++) {
            if(episodios.get(i).getCalificacion()<0){
                return 0;
            }else{
                sumaCal+=episodios.get(i).getCalificacion();
            }
        }
        return sumaCal/episodios.size();
    }
    
    //● Determinar si se vio todos los episodios de la serie. TEMP y SERIE
    public boolean vioTemporadaCompleta(){
        return this.epVistos() == episodios.size(); 
    }
    
}
