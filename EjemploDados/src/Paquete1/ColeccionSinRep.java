
package Paquete1;


public class ColeccionSinRep extends  ColeccionDeElementos{
    
    public ColeccionSinRep(){
        super(0);
    }
    public void agregar(Object o){
        if(this.indiceDe(o)==-1){
            super.agregar(o);
        }
    }
}

//Arraylist<clase> nombreArray = new Arraylist<>();
