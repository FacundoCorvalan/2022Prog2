
package establecimientoDeportivo;

import java.time.LocalDate;


public class Usuario {
    private String nombre,apellido;
    private LocalDate ultTurnoSacado;
    
    public Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ultTurnoSacado = LocalDate.of(2000, 1, 1);
    }
    
    public Usuario(String nombre, String apellido, boolean socio, LocalDate ult, int cantMeses,int cantTurnosAntesFechaLimite, int minTurnosAntesFechaLimite) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ultTurnoSacado = LocalDate.of(2000, 1, 1);
    
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

    public LocalDate getUltTurnoSacado() {
        return ultTurnoSacado;
    }

    public void setUltTurnoSacado(LocalDate ultTurnoSacado) {
        this.ultTurnoSacado = ultTurnoSacado;
    }
    
    
    

}
