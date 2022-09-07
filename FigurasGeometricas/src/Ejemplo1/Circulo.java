
package Ejemplo1;


public class Circulo {
    String nombre;
    double radio;

    
    public Circulo(double rad){
        nombre = "Circulo";
        this.radio = rad;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if(radio>0){
            this.radio = radio;

        }else{
            this.radio = -radio;
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public double getArea(){
        return Math.PI* Math.pow(radio, 2);
    }
    
    public double getDiametro(){
        return radio * 2;
    }
    
    public double getPerimetro(){
        return Math.PI *this.getDiametro();
    }
    
    
}
