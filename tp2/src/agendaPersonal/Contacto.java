
package agendaPersonal;
/*
Asimismo, deben registrarse lo 
contactos telefónicos y mail de los asistentes.

*/

public class Contacto {
    private String tel;
    private String mail;
    
    public Contacto(String tel,String mail){
        this.tel = tel;
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public String getMail() {
        return mail;
    }
    
    
}
