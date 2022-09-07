
package impuestos;

import java.util.ArrayList;


public class Pais {
    private String nombrePais;
    private ArrayList<Provincia>provincias;
    
    
    public Pais(String nombre){
        this.nombrePais = nombre;
        this.provincias = new ArrayList<>();
    }
    
    public void agregarProvincias(Provincia p) {
        this.provincias.add(p);
    }
    
    public void listaProvinciaYCiudades(){
        for (int i = 0; i < provincias.size(); i++) {
            if(provincias.get(i).isDeficitProvincia()){
                System.out.println("Provincia: "+provincias.get(i).getNombreProvincia()+"\n");
                System.out.println("Lista de ciudades");
                provincias.get(i).listaCiudadesDeficit();
            }
        }
    }
}
