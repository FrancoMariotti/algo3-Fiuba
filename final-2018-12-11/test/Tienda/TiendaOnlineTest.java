package Tienda;

import fiuba.algo3.tiendaonline.Cupones.BlackFriday;
import fiuba.algo3.tiendaonline.Pedido;
import fiuba.algo3.tiendaonline.TiendaOnline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TiendaOnlineTest {
    private static final double DELTA = 1e-15;

    @Test
    public void test00SeCreaTiendaConNombreLoDeCarlosCorrectamente() {
        TiendaOnline tienda = new TiendaOnline("Lo de Carlos");

        assertEquals("Lo de Carlos", tienda.getNombre());
    }

    @Test
    public void test01SeCreaPedidoDeUnProductoDeValor3500YElTotalAPagarEs3500() {
        //Arrange
        TiendaOnline tienda = new TiendaOnline("Lo de Carlos");
        tienda.agregarProducto("Raspberry Pi 3",3500.0,2);
        Pedido pedido = tienda.crearNuevoPedido();

        //Act
        tienda.agregarProductoAlPedido(pedido,"Raspberry Pi 3",1);

        //Assert
        assertEquals(tienda.cobrarPedido(pedido), 3500.0,DELTA);
    }


    @Test
    public void test02SeCreaPedidoPorUnTotalDe100PesosConCuponDeDescuentoBlackFridayYElTotalAPagarEs15Pesos() {
        //Arrange
        String idPedido = "pedidoDeFranco";
        TiendaOnline tienda = new TiendaOnline("Lo de Carlos");
        tienda.agregarProducto("Raspberry Pi 3",100.0,2);
        Pedido pedido = tienda.crearNuevoPedido();
        tienda.agregarProductoAlPedido(pedido,"Raspberry Pi 3",1);

        //Act
        tienda.agregarCuponDeDescuento(pedido,new BlackFriday());

        //Assert
        assertEquals(tienda.cobrarPedido(pedido), 15.0,DELTA);
    }

    @Test
    public void test03NoSePuedeAgregarMasCantidadDeUnProductoQueLaQueSeEncuentraEnElStock() {
        //Arrange
        String idPedido = "pedidoDeFranco";
        TiendaOnline tienda = new TiendaOnline("Lo de Carlos");
        tienda.agregarProducto("Raspberry Pi 3",100.0,2);
        Pedido pedido = tienda.crearNuevoPedido();
        //Act
        tienda.agregarProductoAlPedido(pedido,"Raspberry Pi 3",3);
        //Assert
        //assertThrow();
    }

}
