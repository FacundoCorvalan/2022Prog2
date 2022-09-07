
package Ejercicio1;

import java.util.ArrayList;


public class Encuesta {
    private ArrayList<String> preguntas;
    Persona p1;
    Empleado e1;
    private boolean respondido;
    
    public Encuesta(int dni){
        preguntas = new ArrayList<>();
        p1 = new Persona(dni);
        e1 = new Empleado();
        this.respondido = false;
    }
    
}
