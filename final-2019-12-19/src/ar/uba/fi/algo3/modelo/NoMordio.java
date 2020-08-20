package ar.uba.fi.algo3.modelo;

public class NoMordio implements EstadoMordida{
    @Override
    public double deuda(double cuota) {
        return cuota;
    }

    @Override
    public int sumarMordida(int mordidas) {
        return mordidas;
    }
}
