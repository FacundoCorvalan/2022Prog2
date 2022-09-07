
package Paquete1;


public class ColeccionDeElementos {
    private Object[] elementos;
    private int cant;
    
    public ColeccionDeElementos(int max){
        this.cant = 0;
        this.elementos = new Object[max];
    }
    
    public int cantElementos(){
        return cant;
    }
    
    public void agregar(Object o){
        if(this.cant < elementos.length){
            this.elementos[cant]=o;
        }else{
            Object[]aux = new Object[cant*2];
            for(int i = 0; i < cant; i++) {
                aux[i]=this.elementos[i];
                
            }
            this.elementos = aux;
            this.elementos[cant]=o;
            cant++;
        }
    }
    
    public Object obtenerElemento(int i){
        if(i<cant){
            return this.elementos[i];
        }else{
            return null;
        }
        
        
    }
    
    public int indiceDe(Object o){
        for (int i = 0; i < cant; i++) {
            if(this.elementos[i].equals(o)){
                return i;
            }
            
            
        }
        return -1;
    }
}
