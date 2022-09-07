
public class Principal {
    public static void main(String [] args){
        PuntoGeometrico p1 = new PuntoGeometrico(1, 5);
        PuntoGeometrico p2 = new PuntoGeometrico(4, 7);
        
        Rectangulo r1 = new Rectangulo(p1, p2);//(x1,y1)(x2,y2) = (1,7)(4,9)
        Rectangulo r2 = new Rectangulo(p1, p2);
        System.out.println("Area "+r1.calcularArea());
        r1.desplazar(-3, -6);
        System.out.println("Area "+r1.calcularArea());
        
        System.out.println(r1.compararOtroRectangulo(r2));
        
        r1.esCuadrado();
        
        r1.ladoSuperior();
        r1.postura();
        
        
    } 
}
