import Efectos.CadenaAlFinal;
import Efectos.Efecto;
import Efectos.EfectoCompuesto;
import Efectos.PrimeraLetraMayuscula;
import Fabricas.FabricaDeEfectoDarVueltaYPrimeraMayuscula;
import org.junit.Assert;
import org.junit.Test;

public class EfectosTest {

    @Test
    public void test00EfectoAgregarCadenaAlFinalAgregarUnCincoAlFinalDeLaCadenaAlgo() {
        Efecto efecto = new CadenaAlFinal("5");
        Cadena cadena = new Cadena( "algo");

        cadena.aplicar(efecto);

        Assert.assertEquals(cadena.getValor(), "algo5");
    }

    @Test
    public void test01EfectoCompuestoConEfectoDarVueltaYEfectoPrimeraMayusculaSobreCadenaalgoDevuelveOgla() {
        Cadena cadena = new Cadena( "algo");
        Efecto efecto = new FabricaDeEfectoDarVueltaYPrimeraMayuscula().crear();
        cadena.aplicar(efecto);

        Assert.assertEquals("Ogla", cadena.getValor());
    }

    @Test
    public void testPrimeraMayuscula() {
        Efecto primeraMayuscula = new PrimeraLetraMayuscula();
        String cadena = "algo";

        Assert.assertEquals("Algo", primeraMayuscula.aplicarA(cadena));
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        Cadena cadena = new Cadena("algo");
        Efecto ochoAlFinal = new CadenaAlFinal("8");
        Efecto primeraMayuscula = new PrimeraLetraMayuscula();
        EfectoCompuesto efectoCompuesto = new EfectoCompuesto();
        efectoCompuesto.agregar(primeraMayuscula);
        efectoCompuesto.agregar(ochoAlFinal);

        cadena.aplicar(efectoCompuesto);


        Assert.assertEquals("Algo8", cadena.getValor());
    }

}
