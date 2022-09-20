
package pilaDeElementos;

import java.util.ArrayList;


public class Pila {
    ArrayList<Object> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }
    
    public void push(Object o){
        elementos.add(o);
    }
    
    public void pop(){
        int posUltElem = elementos.size();
        Object ultElem = elementos.get(posUltElem);
        elementos.remove(ultElem);
    }
    
    public void top(){
        System.out.println(elementos.get(0));
    }
    
    public int size(){
        return elementos.size();
    }
    
    public ArrayList copy(){
        return new ArrayList<>(elementos);
    }
    
    public ArrayList reverse(){
        ArrayList<Object> arrReverse = new ArrayList<>();
        for (int i = elementos.size(); i >= 0; i++) {
                arrReverse.add(elementos.get(i));
        }
        
        return arrReverse;
    }
    
    
    public static void main(String[] args) {
        Pila p1 = new Pila();
        
        int nro=1;
        String nombre = "Facundo";
        boolean pregunta = false;
        
        p1.push(nro);
        p1.push(nombre);
        p1.push(pregunta);
        double decimal = 1.4;
        p1.push(decimal);
        p1.pop();
        
        p1.top();
        
        System.out.println("cant elem pila: "+p1.size());
        //System.out.println(p1.copy());
        //System.out.println(p1.reverse());
    }
}
