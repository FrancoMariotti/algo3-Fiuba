package ar.uba.fi.algo3.modelo;

public class FamiliaConTresHermanos implements Deudor{
    @Override
    public double deuda(double cuotaAlumno, double cuotaMascotas) {
        return cuotaAlumno * 2;
    }
}
