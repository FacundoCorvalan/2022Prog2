
package agendaPersonal;
/*
     Agenda Personal
Una agenda personal permite registrar reuniones en las que el usuario va a participar. En 
tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el 
tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo 
contactos telefónicos y mail de los asistentes.
Consejo: No todos los objetos son “palpables”
Extra: ¿Quién detecta un conflicto de horarios?
*/

public class PrincipalAgenda {
    public static void mai(String[] args) {
        //contacto
        Contacto c1 = new Contacto("1234", "mail1@mail.com");
        Contacto c2 = new Contacto("5678", "mail2@mail.com");
        Contacto c3 = new Contacto("1011", "mail3@mail.com");
        Contacto c4 = new Contacto("1213", "mail4@mail.com");
        Contacto c5 = new Contacto("1415", "mail5@mail.com");

        //reunion
        Reunion r1 = new Reunion("Sum", "tema 1", 5);
        Reunion r2 = new Reunion("Auditorio", "tema 2", 4);
        

        r1.agregarParticipante(c1);
        r1.agregarParticipante(c2);
        r1.agregarParticipante(c3);
        r1.agregarParticipante(c4);
        
        r2.agregarParticipante(c1);
        r2.agregarParticipante(c2);
        r2.agregarParticipante(c3);

        //Agenda
        Agenda a1 = new Agenda();
        
        a1.agregarReuniones(r1);
        
        System.out.println(a1.mostrarAgendaCompleta());
        
        
    }
}
