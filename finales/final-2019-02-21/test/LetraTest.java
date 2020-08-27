import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LetraTest {
    @Test
    public void test00LetraConPeso4NoVocalNoModificaSuPeso() {
        List<Regla> reglas = new LinkedList<>();
        reglas.add(new ReglaLongitudLetra());

        Letra letra = new Letra("s",new NoVocal(),4,reglas);

        assertEquals(letra.getPeso(),4);
    }

    @Test
    public void test01LetraConPeso4VocalDuplicaSuPeso() {
        List<Regla> reglas = new LinkedList<>();
        reglas.add(new ReglaLongitudLetra());

        Letra letra = new Letra("s",new Vocal(),4,reglas);

        assertEquals(letra.getPeso(),8);
    }

    @Test(expected = LongitudLetraException.class)
    public void test02LetraNoPuedeCrearseVacia() {
        List<Regla> reglas = new LinkedList<>();
        reglas.add(new ReglaLongitudLetra());

        Letra letra = new Letra("",new Vocal(),4,reglas);
    }

    @Test(expected = LongitudLetraException.class)
    public void test03LetraNoPuedeTenerLongitudMayorAUno() {
        List<Regla> reglas = new LinkedList<>();
        reglas.add(new ReglaLongitudLetra());

        Letra letra = new Letra("aorgeorjgoperjgoperjg",new Vocal(),4,reglas);
    }

}
