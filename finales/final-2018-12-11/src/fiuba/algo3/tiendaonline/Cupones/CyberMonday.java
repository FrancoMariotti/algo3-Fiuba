package fiuba.algo3.tiendaonline.Cupones;

public class CyberMonday implements Cupon{
    @Override
    public Double aplicarDescuento(Double importe) {
        return importe * 0.5;
    }
}
