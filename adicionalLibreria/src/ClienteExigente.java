




public class ClienteExigente extends Cliente{

    public ClienteExigente(String nombre, String apellido, int dni, String direccion, int descuento) {
        super(nombre, apellido, dni, direccion, descuento);
    }
    
    
    public boolean leGusta(Articulo a){
        if(super.leGusta(a)){
            for (int i = 0; i < generosFav.size(); i++) {
                if(a.tengoGenero(generosFav.get(i)))
                    return true;
            }
        }
        
        return false;
    }
}
