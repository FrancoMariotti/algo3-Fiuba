package fiuba.algo3.tiendaonline.Envios;

public class EnvioLocal implements Envio {
    @Override
    public Double aplicarRecargo(Double importe) {
        return importe * 1.1;
    }
}
