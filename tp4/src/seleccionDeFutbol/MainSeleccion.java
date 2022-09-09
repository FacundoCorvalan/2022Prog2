
package seleccionDeFutbol;

import java.time.LocalDate;

public class MainSeleccion {
    public static void mai(String[] args) {
        Entrenador e1 = new Entrenador("Entrenador", "Apellido", 1234, LocalDate.of(2000, 1, 1), 431);
        Futbolista f1 = new Futbolista("Futbolista", "fff", 332, LocalDate.of(2000, 1, 1), "Delantero", "Zurdo", 44);
        Masajista m1 = new Masajista("Masajista", "mmmm", 6543, LocalDate.of(2000, 1, 1), "Masajista", 44);
        
        System.out.println(e1.mostrarDatos());
        System.out.println(f1.mostrarDatos());
        System.out.println(m1.mostrarDatos());
    }
}
