package ar.uba.fi.algo3.modelo;

public class Mordio implements EstadoMordida{
    @Override
    public double deuda(double cuota) {
        return cuota * 2;
    }

    public int sumarMordida(int mordidas) {
        return mordidas + 1;
    }
}
