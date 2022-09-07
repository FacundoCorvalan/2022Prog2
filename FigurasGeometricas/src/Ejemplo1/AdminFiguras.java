
package Ejemplo1;


public class AdminFiguras {
    public void imprimir(Circulo cc){
        System.out.println(cc.getNombre()+"-" +cc.getArea());
    }
    public static void main(String[] args) {
        AdminFiguras admin = new AdminFiguras();
        Circulo c1 = new Circulo(10);
        Circulo c2 = new Circulo(100);
        admin.imprimir(c1);
        admin.imprimir(c2);
        
    }
}
