
package seleccionDeFutbol;

import java.time.LocalDate;



public class Persona {
    private String nombre,apellido;
    private int numeroPasaporte;
    private LocalDate fechaNacimiento;
    private String estado;
    
    public Persona(String n,String a, int nroP, LocalDate f){
        this.nombre = n;
        this.apellido = a;
        this.numeroPasaporte = nroP;
        this.fechaNacimiento = f;
        this.estado = "en pais de origen";
    }
    
    public String mostrarDatos(){
        return "Nombre completo: "+this.getNombre()+" "+this.getApellido()+
                "\nNro Pasaporte: "+this.getNumeroPasaporte()+
                "\nFecha Nacimiento: "+this.getFechaNacimiento()+
                "\nEstado "+this.imprimirEstado()+
                "\nEsta disponible para evento? "+this.isDisponible();
                
    }
    
    public int getEstado(){
        int e = 0;
        if(this.estado=="en pais de origen"){
            e = 1;
        }else if(this.estado=="en concentracion"){
            e = 2;
        }else if(this.estado == "viajando"){
            e = 3;
        }
        return e;
    }
    
    public String imprimirEstado(){
        String est = null;
        if(this.getEstado()==1){
            est = "En pais de Origen";
        }else if(this.getEstado()==2){
            est = "En concentracion";
        }else if(this.getEstado()==3){
            est = "Viajando";
        }
        return est;
    }
    
    public boolean isDisponible(){
        return this.getEstado() == 1;
    }
    
    public void disponibleParaEvento(Persona p1){
        System.out.println(p1.getNombre()+" esta disponible? "+ isDisponible());
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
    
}
