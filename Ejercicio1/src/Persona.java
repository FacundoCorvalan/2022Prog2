
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, int dni, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
       
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    
    public Persona(int dni){
        this("N", "N", LocalDate.of(2000, 1, 1), dni, "Femenino", 1, 1);
        
    }
    
    public Persona(int dni,String nombre, String apellido){
        this(nombre, apellido, LocalDate.of(2000, 1, 1), dni, "Femenino", 1, 1);
    }
    
    public Persona(int dni, String nombre, String apellido,LocalDate fechaNacimiento){
        this(nombre, apellido, fechaNacimiento, dni, "Femenino", 1, 1);
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double masaCorporal(){
        return this.peso/(this.altura*2);
    }
    
    public boolean estaEnForma(){
        return masaCorporal()>18.5 && masaCorporal()<25;
    }
    
    public boolean cumpleAnios(){
        return this.fechaNacimiento == LocalDate.now();
    }
    
    public int edadActual(){
        LocalDate fechaActual;
        int edad;
        fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento,fechaActual);
        edad = periodo.getYears();
        
        return edad;
    }
    
    public boolean mayorEdad(){
        return this.edadActual() > 18 ;
    }
    
    public boolean puedeVotar(){       
        return this.edadActual() > 16;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre completo: "+ this.nombre + " "+this.apellido+"\nEdad: "+edadActual()+"\nFecha de nacimiento: "+
                this.fechaNacimiento+"\nSexo: "+this.sexo+"\nPeso: "+this.peso+"\nAltura: "+this.altura);
    }
    
}
