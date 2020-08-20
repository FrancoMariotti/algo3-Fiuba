package fiuba.algo3.tiendaonline;

import fiuba.algo3.tiendaonline.Cupones.Cupon;
import fiuba.algo3.tiendaonline.Envios.Envio;

public class Pedido {
    private Double total;
    private Double recargoEnvio;
    private EstadoEnvio estadoEnvio;

    public Pedido() {
        this.total = 0.0;
        this.recargoEnvio = 0.0;
    }

    public void agregar(Double precioItem,Integer cantidad) {
        total += precioItem * cantidad;
    }

    public void agregar(Envio envio) {
        total = envio.aplicarRecargo(total);
    }

    public void agregar(Cupon cupon) {
        total = cupon.aplicarDescuento(total);
    }

    public Double total() {
        return total + recargoEnvio;
    }
}
