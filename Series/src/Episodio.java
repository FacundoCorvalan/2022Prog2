/*
    1 Series
Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una 
cantidad de episodios. Cada episodio posee un título, una descripción, un flag indicando 
si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un 
episodio particular, la calificación dada será un valor negativo.
Las series poseen como atributos (además de los episodios correspondientes) un título, 
una descripción, un creador y un género.
Implementar en Java las clases involucradas, determinar qué clase es responsable de 
responder los siguientes servicios e implementar en Java.

● Ingresar la calificación de un episodio. Si el valor ingresado como calificación 
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior. EP
● Obtener el total episodios vistos de una temporada particular. TEMP **
● Obtener el total de episodios vistos de una serie. TEMP o SERIE?**
● Obtener el promedio de las calificaciones dadas para una temporada particular. TEMP**
● Obtener el promedio de las calificaciones dadas para una serie. **
● Determinar si se vio todos los episodios de la serie. TEMP y SERIE **
Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos 
*/

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;
    
    public Episodio(String titulo,String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = false;
        this.calificacion = -1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if(calificacion>0 && calificacion < 6){
            this.calificacion = calificacion;

        }else{
            System.out.println("Calificacion Incorrecta");
        }
            
    }
    
    
    
}
