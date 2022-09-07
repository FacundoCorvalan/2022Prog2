
package agendaPersonal;

import java.util.ArrayList;

/*
     Agenda Personal
Una agenda personal permite registrar reuniones en las que el usuario va a participar.
En tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el 
tema que van a tratar y la duración de la misma.
Asimismo, deben registrarse los contactos telefónicos y mail de los asistentes.
Consejo: No todos los objetos son “palpables”
Extra: ¿Quién detecta un conflicto de horarios?
*/
public class Agenda {
    ArrayList<Reunion>reuniones;
    
    public Agenda(){
        this.reuniones = new ArrayList<>();
    }
    
    public void agregarReuniones(Reunion r){
        reuniones.add(r);
    }
    
    public String mostrarAgendaCompleta(){
        String datos=null;
        for (int i = 0; i < reuniones.size(); i++) {
            datos = (reuniones.get(i).mostrarDatos());
        }
        return datos;
    }
    
    
    
    
}
