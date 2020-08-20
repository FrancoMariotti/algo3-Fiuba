package fiuba.algo3.tiendaonline;

import fiuba.algo3.tiendaonline.Cupones.Cupon;
import fiuba.algo3.tiendaonline.Envios.Envio;

import java.util.HashMap;
import java.util.Map;

public class TiendaOnline {

    private String nombre;
    private Stock stock;
    private Map<String, Double> preciosProductos;

    public TiendaOnline(String nombre) {
        this.nombre = nombre;
        this.stock = new Stock();
        this.preciosProductos = new HashMap<String, Double>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(String nombreProducto,Double precio,int cantidad) {
        preciosProductos.put(nombreProducto,precio);
        stock.agregar(nombreProducto,cantidad);
    }

    public Pedido crearNuevoPedido() {
        System.out.println("Se ha creado un nuevo pedido.");
        return new Pedido();
    }

    public void agregarProductoAlPedido(Pedido pedido,String nombreProducto, int cantidad) {
        double precioItem = preciosProductos.get(nombreProducto);
        stock.disminuir(nombreProducto,cantidad);
        pedido.agregar(precioItem,cantidad);
        System.out.println("Se ha agregado un producto al pedido.");
    }

    public void agregarCuponDeDescuento(Pedido pedido, Cupon cupon) {
        pedido.agregar(cupon);
        System.out.println("Se ha agregado un descuento al pedido.");
    }

    public void agregarEnvio(Pedido pedido, Envio envio) {
        pedido.agregar(envio);
        System.out.println("Se ha agregado un envio al pedido");
    }

    public double cobrarPedido(Pedido pedido) {
        System.out.println("Se ha cobrado el pedido");
        return pedido.total();
    }
}
