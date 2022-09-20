
import java.util.ArrayList;



public class Articulo {
    private String nombre;
    private String autor;
    private double precio;
    private int cantPag;
    private String resumen;
    private ArrayList<String>generos;
    
    public Articulo(String nombre,String autor, double precio,int cant, String resumen){
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantPag = cant;
        this.resumen = resumen;
        this.generos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantPag() {
        return cantPag;
    }

    public String getResumen() {
        return resumen;
    }
    
    
    
    public void addGenero(String g){
        if(!generos.contains(g)){//con array de tipo String no hay que redefinir nada
            generos.add(g);
        }
    }
    
    public ArrayList<String> getGeneros(){
        return new ArrayList<>(generos);//no recomendable pero usable
    }
    
    public void setGenero(ArrayList<String> g){
        this.generos = new ArrayList<>(g);
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Articulo otro = (Articulo) obj;//casting
            return nombre.equals(otro.getNombre()) && autor.equals(otro.getAutor());
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean tengoGenero(String g){
        return generos.contains(g);
    }
    
    
}
