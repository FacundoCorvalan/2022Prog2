
import java.util.ArrayList;



public class Libreria {
    private ArrayList<Cliente>clientes;
    private ArrayList<Cliente> resultado;


    
    public ArrayList<Cliente> listadoClientesPAra(Articulo a){
        for (int i = 0; i < clientes.size(); i++) {
            Cliente ci = clientes.get(i);
            if(ci.leGusta(a)){
                resultado.add(ci);
            }
        }
        
        return resultado;

    }
    
    
}
