package ar.uba.fi.algo3.modelo;

public class Mascota implements Deudor{
    EstadoMordida mordida;

    public Mascota() {
        mordida = new NoMordio();
    }

    @Override
    public double deuda(double cuotaAlumno, double cuotaMascotas) {
        return mordida.deuda(cuotaMascotas);
    }

    public void morder() {

        mordida = new Mordio();
    }

    public int sumarMordida(int mordidas) {
        return mordida.sumarMordida(mordidas);
    }
}
