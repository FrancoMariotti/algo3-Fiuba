package fiuba.algo3.tiendaonline.Envios;

public class EnvioInternacional implements Envio {

    @Override
    public Double aplicarRecargo(Double importe) {
        return importe * 1.2;
    }
}
