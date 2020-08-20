package Envios;

import fiuba.algo3.tiendaonline.Envios.Envio;
import fiuba.algo3.tiendaonline.Envios.EnvioInternacional;
import fiuba.algo3.tiendaonline.Envios.EnvioLocal;
import fiuba.algo3.tiendaonline.Pedido;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnvioTest {
    private static final double DELTA = 1e-10;

    @Test
    public void test00SeAplicaRecargoAImporteDe100PesosPorEnvioLocalYElImporteFinalEsDe110(){
        //Arrange
        Pedido pedido = new Pedido();
        pedido.agregar(100.0,1);
        Envio envioLocal = new EnvioLocal();
        //Act
        pedido.agregar(envioLocal);
        //Assert
        assertEquals(pedido.total(),110.0,DELTA);
    }

    @Test
    public void test01SeAplicaRecargoAImporteDe100PesosPorEnvioInternacionalYElImporteFinalEsDe120(){
        //Arrange
        Pedido pedido = new Pedido();
        pedido.agregar(100.0,1);
        Envio envioInternacional = new EnvioInternacional();
        //Act
        pedido.agregar(envioInternacional);
        //Assert
        assertEquals(pedido.total(),120.0,DELTA);
    }

}
