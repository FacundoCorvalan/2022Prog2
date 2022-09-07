
package seleccionDeFutbol;

import java.time.LocalDateTime;


public class Persona {
    private String nombre,apellido;
    private int numeroPasaporte;
    private LocalDateTime fechaNacimiento;
    
    public Persona(String n,String a, int nroP, LocalDateTime f){
        this.nombre = n;
        this.apellido = a;
        this.numeroPasaporte = nroP;
        this.fechaNacimiento = f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
