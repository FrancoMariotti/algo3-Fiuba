package fiuba.algo3.tiendaonline.Cupones;

public class MerryChristmas implements Cupon{
    @Override
    public Double aplicarDescuento(Double importe) {
       return importe  * 0.75;
    }
}
