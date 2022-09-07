

public class Rectangulo {
    
    PuntoGeometrico p1;
    PuntoGeometrico p2;
    
    public Rectangulo(PuntoGeometrico p1, PuntoGeometrico p2 ){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public void desplazar(int coordX, int coordY){
        this.p1.moverPunto(coordX, coordY);
        this.p2.moverPunto(coordX, coordY);
        
        System.out.println("Rectangulo movido a (" + p1.getX() + ", " +p1.getY() + ")(" + p2.getX() + ", " + p2.getY() + ")"  );
    }  
    
    public double obtenerBase(){
        return this.p2.getX() - this.p1.getX();
    }
    
    public double obtenerAltura(){
        return this.p2.getY() - this.p1.getY();
    }
    
    public double calcularArea(){
        double base = obtenerBase();
        double altura = obtenerAltura();
        return base * altura;
    }
    
    public int compararOtroRectangulo(Rectangulo otroRectangulo){
        if(this.calcularArea() > otroRectangulo.calcularArea()){
            return 1;
        }else if(this.calcularArea()<otroRectangulo.calcularArea()){
            return -1;
        }else{
            return 0;
        }
    }
    
    
    public boolean esCuadrado(){
        return this.obtenerBase() == this.obtenerAltura();
        
    }
   
    public void ladoSuperior(){
        if(this.obtenerBase()>this.obtenerAltura()){
            System.out.println("La base es mayor que la altura");
        }else if(this.obtenerBase()<this.obtenerAltura()){
            System.out.println("La altura es mayor que la base");
        }else{
            System.out.println("Base y altura son iguales");
        }
    }
    
    public void postura(){
        if(this.obtenerBase()>this.obtenerAltura()){
            System.out.println("Acostado");
        }else if(this.obtenerBase()<this.obtenerAltura()){
            System.out.println("Parado");
        }else{
            System.out.println("Base y altura son iguales");
        }
    }
    
    
    
    
    
}