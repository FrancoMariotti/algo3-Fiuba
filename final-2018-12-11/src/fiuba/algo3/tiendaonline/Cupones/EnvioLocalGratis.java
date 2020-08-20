package fiuba.algo3.tiendaonline.Cupones;

public class EnvioLocalGratis implements Cupon{
    @Override
    public Double aplicarDescuento(Double importe) {
        return importe - importe * 0.1;
    }
}
