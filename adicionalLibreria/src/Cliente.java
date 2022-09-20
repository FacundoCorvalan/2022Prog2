
import java.util.ArrayList;



public class Cliente {
    private String nombre,apellido;
    private int dni;
    private String direccion;
    private ArrayList<String> autoresFav;
    protected ArrayList<String> generosFav;
    private ArrayList<Articulo> compras;
    private int descuento;
    
    
    
    public Cliente(String nombre, String apellido, int dni, String direccion, int descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.descuento = descuento;
    }
    
    public boolean leGusta(Articulo a){
        for (int i = 0; i < autoresFav.size(); i++) {
            String autori = autoresFav.get(i);
            if (autori.equals(a.getAutor())){//o usar contains
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<String> getGeneros(){
        return new ArrayList<>(generosFav);
    }
    
    
    public void addAutor(String autor){
        if(!autoresFav.contains(autor)){
            autoresFav.add(autor);
        }
    }
    public void addCompra(Articulo  a){
        if(!compras.contains(a)){//redefinir el equals de Articulo
            compras.add(a);
        }
    }
    
    public boolean yaCompro(Articulo art){
        return compras.contains(art);
    }
    
    
    
}
