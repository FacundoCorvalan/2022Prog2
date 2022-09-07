
package alarma;


public class AlarmaLuminosa extends Alarma{
    private Luz l1;
    
    public AlarmaLuminosa(){
        super();
        this.l1 = new Luz();
    }
    
    @Override
    public void comprobar(){
        if(super.detectoAnomalia()){
            super.comprobar();
            l1.encender();
        }else{
            System.out.println("Todo en orden!!");
        }
    }
        
}
