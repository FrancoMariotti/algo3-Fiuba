package fiuba.algo3.tiendaonline;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map<String, Integer> stockProductos;

    public Stock() {
        this.stockProductos = new HashMap<String, Integer>();
    }

    public void agregar(String nombreProducto,int cantidad) {
        stockProductos.put(nombreProducto,cantidad);
    }

    public void disminuir(String nombreProducto,int cantidad) {
        int stock = stockProductos.get(nombreProducto);
        stock -= cantidad;
        if(stock < 0) {
            //throw NoHayMasStockexception
        }
        stockProductos.put(nombreProducto, stock); // actualizo el stock
    }

}
