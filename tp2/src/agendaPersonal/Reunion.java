
package agendaPersonal;

import java.util.ArrayList;

/*
En tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el 
tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo 
contactos telefónicos y mail de los asistentes.
*/


public class Reunion {
    private String lugar;
    private ArrayList<Contacto>contactos;
    private String temaATratar;
    private int duracionReunion;
    
    public Reunion(String lugar,String tema, int duracion){
        this.lugar = lugar;
        this.contactos = new ArrayList<>();
        this.temaATratar = tema;
        this.duracionReunion = duracion;
    }
    
    public void agregarParticipante(Contacto c){
        contactos.add(c);
    }

    
    
    
    public String getLugar() {
        return lugar;
    }

    public String getTemaATratar() {
        return temaATratar;
    }

    public int getDuracionReunion() {
        return duracionReunion;
    }
    
    public String getMailContactos(){
        String mail = contactos.get(0).getMail()+"\n";
        for (int i = 1; i < contactos.size(); i++) {
            mail += contactos.get(i).getMail()+"\n";
        }
        return mail;
    }
    
    
    public String getTelContactos(){
        String tel = null;
        for (int i = 0; i < contactos.size(); i++) {
            tel += contactos.get(i).getTel()+"\n";
        }
        return tel;
    }
    public String mostrarDatos(){
        return("Lugar: "+this.getLugar()+
                "\nTema: "+this.getTemaATratar()+
                "\nDuracion: "+this.getDuracionReunion()+
                "\nParticipantes: \nMail:\n "+this.getMailContactos()+"\n"+
                "\nTel: \n"+this.getTelContactos());
    }

    //IMPORTANTE: OBTENER MAIL Y TEL EN UN SOLO METODO PARA QUE SE RELACIONE UN MAIL CON SU PROPIO TEL
    
    
}
