

public class Principal {
    public static void main(String[] args) {
        Episodio e1 = new Episodio("ep1", "cap1");
        Episodio e2 = new Episodio("ep2", "cap2");
        Episodio e3 = new Episodio("ep3", "cap3");
        Episodio e4 = new Episodio("ep4", "cap4");
        
        e1.setFlag(true);
        e3.setFlag(true);
        
        
        //● Ingresar la calificación de un episodio. Si el valor ingresado como calificación 
            //no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
        e2.setCalificacion(4);
        e4.setCalificacion(2);
        
        Temporada t1 = new Temporada();
        
        t1.agregarEpisodio(e1);
        t1.agregarEpisodio(e2);
        t1.agregarEpisodio(e3);
        t1.agregarEpisodio(e4);
        
        //● Obtener el total episodios vistos de una temporada particular. TEMP **  
        System.out.println("Episodios vistos en la temporada");
        t1.epVistos();
        
        //● Obtener el promedio de las calificaciones dadas para una temporada particular. TEMP**
        System.out.println("Promedio de calificaciones de una temporada");
        t1.promedioCal();
        
        
        Serie s1 = new Serie();
        
        s1.agregarTemporada(t1);
        
        //● Obtener el total de episodios vistos de una serie. TEMP o SERIE?**
        System.out.println("Capitulos vistos de una serie");
        s1.epVistosSerie();
        //● Obtener el promedio de las calificaciones dadas para una serie. **
        System.out.println("Promedio calificaciones de una serie");
        s1.promedioSerie();
        //● Determinar si se vio todos los episodios de la serie. TEMP y SERIE **
        
/*

Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos*/


    }
}
