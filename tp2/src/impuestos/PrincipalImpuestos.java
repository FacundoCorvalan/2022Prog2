
package impuestos;
/*
3 Sistema de Control de Gastos Públicos
Un país tiene que controlar el gasto público de las ciudades con más de 100.000 habitantes.
Para ello, tiene información del monto recaudado por cada ciudad a través de 
cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e 
imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. Este 
país necesita un sistema que le informe cuales son las ciudades que gastan más de lo 
que recaudan, y las provincias que tienen mas de la mitad de las ciudades en condición 
de déficit.
Consejo: Tener en cuenta la información que contienen los distintos impuestos
Extra: ¿En que afecta el tamaño de la ciudad?
*/

public class PrincipalImpuestos {

    public static void mai(String[] args) {
        Ciudad c1 = new Ciudad("c1", 100000, 1, 2, 3, 4, 5, 0);
        Ciudad c2 = new Ciudad("c2", 100000, 1, 2, 3, 4, 5, 5000000);
        Ciudad c3 = new Ciudad("c3", 100000, 1, 2, 3, 4, 5, 5000000);
        Ciudad c4 = new Ciudad("c4", 100000, 1, 2, 3, 4, 5, 5000000);
        Ciudad c5 = new Ciudad("c5", 100000, 1, 2, 3, 4, 5, 5000000);
        Ciudad c6 = new Ciudad("c6", 100000, 1, 2, 3, 4, 5, 5000000);
        Ciudad c7 = new Ciudad("c7", 100000, 1, 2, 3, 4, 5, 5000000);
        Ciudad c8 = new Ciudad("c8", 100000, 1, 2, 3, 4, 5, 5000000);
        
        
        Ciudad g1 = new Ciudad("G1", 100, 1, 2, 3, 4, 5, 100000);
        Ciudad g2 = new Ciudad("G2", 100000, 1, 2, 3, 4, 5, 100000);
        Ciudad g3 = new Ciudad("G3", 100000, 1, 2, 3, 4, 5, 100000);
        Ciudad g4 = new Ciudad("G4", 100000, 1, 2, 3, 4, 5, 100000);
        Ciudad g5 = new Ciudad("G5", 100000, 1, 2, 3, 4, 5, 100000);

        
        Provincia p1 = new Provincia("P1");
        Provincia p2 = new Provincia("P2");
        Pais pais1 = new Pais("Pais 1");
        
        
        p1.agregarCiudades(c1);
        p1.agregarCiudades(c2);
        p1.agregarCiudades(c3);
        p1.agregarCiudades(c4);
        p1.agregarCiudades(c5);
        p1.agregarCiudades(c6);
        p1.agregarCiudades(c7);
        p1.agregarCiudades(c8);
        
        p2.agregarCiudades(g1);
        p2.agregarCiudades(g2);
        p2.agregarCiudades(g3);
        p2.agregarCiudades(g4);
        p2.agregarCiudades(g5);

        
        pais1.agregarProvincias(p1);
        pais1.agregarProvincias(p2);
        
        pais1.listaProvinciaYCiudades();
    }
}
