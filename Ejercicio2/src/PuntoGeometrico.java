
public class PuntoGeometrico {
    private int x;
    private int y;
    
    public PuntoGeometrico(){
        this.x = 0;
        this.y = 0;
    }

    public PuntoGeometrico(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    public void moverPunto(int nX, int nY){
        this.x += nX;
        this.y += nY;
    }
    
    public double distanciaEuclidea(PuntoGeometrico otroPunto){
        double x1=this.getX();
        double y1=this.getY();
        double x2=otroPunto.getX();
        double y2=otroPunto.getY();
        double distanciaAl2 = Math.pow((x1-x2), 2) + Math.pow((y1-y2),2);
        
        return Math.sqrt(distanciaAl2);
    }
}
