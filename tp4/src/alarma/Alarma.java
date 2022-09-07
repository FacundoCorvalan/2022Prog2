
package alarma;


public class Alarma {
    private boolean vidrioRoto,puertaAbierta,ventanaAbierta,detectoMovimiento;
    private Timbre t1;
    
    
    public Alarma(){
        this.vidrioRoto = false;
        this.puertaAbierta = false;
        this.ventanaAbierta = false;
        this.detectoMovimiento = false;
        this.t1 = new Timbre();
    }
    
    public void comprobar(){
        if(detectoAnomalia()){
            t1.hacerSonar();
        }
        else{
            System.out.println("Todo en orden");
        }
    }
    
    public boolean detectoAnomalia(){
        return this.vidrioRoto || this.puertaAbierta || this.ventanaAbierta || this.detectoMovimiento;
    }

    public boolean isVidrioRoto() {
        return vidrioRoto;
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isVentanaAbierta() {
        return ventanaAbierta;
    }

    public void setVentanaAbierta(boolean ventanaAbierta) {
        this.ventanaAbierta = ventanaAbierta;
    }

    public boolean isDetectoMovimiento() {
        return detectoMovimiento;
    }

    public void setDetectoMovimiento(boolean detectoMovimiento) {
        this.detectoMovimiento = detectoMovimiento;
    }

    public Timbre getT1() {
        return t1;
    }

    public void setT1(Timbre t1) {
        this.t1 = t1;
    }
    
    
    
}
