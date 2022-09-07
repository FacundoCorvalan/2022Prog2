
package alarma;


public class MainAlarma {

    public static void mai(String[] args) {
        Alarma a1 = new Alarma();
        
        System.out.println("|Alarma comun|");
        //a1.comprobar();
        a1.setPuertaAbierta(true);
        a1.comprobar();
        
        
        System.out.println("|Alarma Luminosa|");
        AlarmaLuminosa aL1 = new AlarmaLuminosa();
        //aL1.comprobar();
        aL1.setVidrioRoto(true);
        aL1.comprobar();
        
        
    }
}
