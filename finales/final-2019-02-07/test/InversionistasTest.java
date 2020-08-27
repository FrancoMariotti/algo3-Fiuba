import modelo.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InversionistasTest {
    @Test
    public void test00InversionistaConservadorInvierte100PesosEnPlazoFijoYObtiene200Pesos() {
        Inversion plazoFijo = new PlazoFijo();
        Inversionista conservador = new InversionistaConservador();

        assertEquals("Invesionista Conservador hace una inversion en plazo fijo y obtiene el doble de la inversion inicial",conservador.invertir(100,plazoFijo), 200);
    }

    @Test
    public void test01InversionistaConservadorNopuedeInvertirEnLebac() {
        Inversion lebac = new Lebac();
        Inversionista conservador = new InversionistaConservador();

        assertEquals("Invesionista Conservador no puede invertir en lebacs y por lo tanto el monto final es igual al inicial",conservador.invertir(100,lebac), 100);
    }


    @Test
    public void test02InversionistaArriesgadoInvierte100PesosEnLebacYObtiene300Pesos() {
        Inversion lebac = new Lebac();
        Inversionista arriesgado = new InversionistaArriesgado();

        assertEquals("Invesionista Conservador no puede invertir en lebacs y por lo tanto el monto final es igual al inicial",arriesgado.invertir(100,lebac), 300);
    }


    @Test
    public void test03InversionistaAgresivoInvierte100PesosEnBitcoinYObtiene400Pesos() {
        Inversion bitcoin = new Bitcoin();
        Inversionista arriesgado = new InversionistaAgresivo();

        assertEquals("Invesionista Conservador no puede invertir en lebacs y por lo tanto el monto final es igual al inicial",arriesgado.invertir(100,bitcoin), 400);
    }


    @Test
    public void test04InversionistaAgresivoInvierte100PesosEnBitcoinYObtiene400Pesos() {
        Inversion bitcoin = new Bitcoin();
        Inversionista arriesgado = new InversionistaAgresivo();

        assertEquals("Invesionista Conservador no puede invertir en lebacs y por lo tanto el monto final es igual al inicial",arriesgado.invertir(100,bitcoin), 400);
    }
}
