package fiuba.algo3.tiendaonline.Cupones;

public class BlackFriday implements Cupon {
    @Override
    public Double aplicarDescuento(Double importe) {
        return importe *0.15;
    }
}
