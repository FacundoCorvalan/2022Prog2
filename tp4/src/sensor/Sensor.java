/*
2- Alarma Sensorial
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se 
cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de 
la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen 
nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por 
pantalla el nombre de la zona en conflicto (pueden ser más de una).
*/
package sensor;


public class Sensor {
    private String nombreZonaSensor;
    private boolean activo;
    
    public Sensor(String nombre){
        this.nombreZonaSensor = nombre;
        this.activo = false;
    }
    
    public String getNombreZonaSensor(){
        return this.nombreZonaSensor;
    }
    
    public boolean isActivo(){
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
}
