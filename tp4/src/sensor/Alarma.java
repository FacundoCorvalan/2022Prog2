
package sensor;

import java.util.ArrayList;


public class Alarma {
    private ArrayList<Sensor> sensores;
    Timbre t1;
    public Alarma(){
        this.sensores = new ArrayList<>();
        this.t1 = new Timbre();
    }
    
    public void agregarSensor(Sensor s){
        sensores.add(s);
    }
    
    
    public void comprobar(){
        for (int i = 0; i < sensores.size(); i++) {
            if(sensores.get(i).isActivo()){
                System.out.println("Alarma activa en: "+sensores.get(i).getNombreZonaSensor());
                t1.hacerSonar();
            }else{
                System.out.println("Todo en orden con "+sensores.get(i).getNombreZonaSensor());
            }
        }
    }
    
}
