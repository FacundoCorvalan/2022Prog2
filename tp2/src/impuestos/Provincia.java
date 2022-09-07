
package impuestos;

import java.util.ArrayList;


public class Provincia {
    private String nombreProvincia;
    private ArrayList<Ciudad>ciudades;
    final static int MINPOBLACION = 100000;
    private boolean deficitProvincia;
    
    public Provincia(String nombre){
        this.nombreProvincia = nombre;
        this.ciudades = new ArrayList<>();
        this.deficitProvincia = isDeficitProvincia();
    }
    
    public void agregarCiudades(Ciudad c){
        ciudades.add(c);
        
    }
    
    public int cantCiudadesDeficit(){
        int cantDeficit=0;
        for (int i = 0; i < ciudades.size(); i++) {
            if(ciudades.get(i).getPoblacion()>= MINPOBLACION && ciudades.get(i).isDeficit()){
                cantDeficit++;
            }
        }
        
        return cantDeficit;
       
    }
    
    public void listaCiudadesDeficit(){//imprime nombre ciudades en deficit
        for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i).getPoblacion()>= MINPOBLACION && ciudades.get(i).isDeficit())
                System.out.println(ciudades.get(i).getNombreCiudad()) ;
        }
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }
    
    
    
    public boolean isDeficitProvincia(){
        int cantCiudades = ciudades.size()/2;
        int contadorCiudadesDeficit = cantCiudadesDeficit();
        
        return cantCiudades < contadorCiudadesDeficit;
    }
    
    
}
