
import java.util.ArrayList;



public class Serie {
    private ArrayList<Temporada> temporadas;
    
    
    public Serie(){
        this.temporadas = new ArrayList<>();
       
    }
    public void agregarTemporada(Temporada t){
        temporadas.add(t);
    }
    
    //● Obtener el total de episodios vistos de una serie. TEMP o SERIE?
    public int epVistosSerie(){
        int cantVistos=0;
        for (int i = 0; i < temporadas.size(); i++) {
            cantVistos += temporadas.get(i).epVistos();
        }
        
        return cantVistos;
    }
    
    //● Obtener el promedio de las calificaciones dadas para una serie. 
    public double promedioSerie(){
        int sumaCalificacion=0;
        for (int i = 0; i < temporadas.size(); i++) {
            sumaCalificacion += temporadas.get(i).promedioCal();
        }
        
        return sumaCalificacion/temporadas.size();
    }
    
}
