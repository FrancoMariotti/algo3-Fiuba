import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PalabraTest {
    @Test
    public void test00PalabraSeCreaCorrectamente() {
        Palabra palabra = new Palabra();
        assertNotNull(palabra);
    }

    @Test
    public void test01PalabraSeCreaConValorHolaYTienePuntaje12() {
        IFabricaDeLetras fabricaDeLetras = new FabricaDeLetras();
        Palabra hola = new Palabra();

        Celda primeraCelda = new Celda(fabricaDeLetras.crear("h",2));
        Celda segundaCelda = new Celda(fabricaDeLetras.crear("o",2));
        Celda terceraCelda = new Celda(fabricaDeLetras.crear("l",2));
        Celda cuartaCelda = new Celda(fabricaDeLetras.crear("a",2));
        hola.agregarCelda(primeraCelda);
        hola.agregarCelda(segundaCelda);
        hola.agregarCelda(terceraCelda);
        hola.agregarCelda(cuartaCelda);
        hola.agregarCelda(cuartaCelda);

        assertEquals(hola.puntaje(),12);
    }
}
